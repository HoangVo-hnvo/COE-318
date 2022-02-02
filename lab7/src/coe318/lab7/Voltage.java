/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author hoang
 */
public class Voltage{
    
    Circuit c1 = Circuit.getInstance();
    
    private double voltage;
    private Node node1,node2;
    private int idNumber;
    static int count = 1;
    
    public Voltage( Node node1, Node node2, double voltage){
        if(node1 == null || node2 == null) {
            throw new IllegalArgumentException("s can't be null");
        }
        if(voltage < 0){
            this.voltage = -1*voltage; 
            this.node1 = node2;
            this.node2 = node1;
        }
        else{
            this.voltage = voltage;
            this.node1 = node1;
            this.node2 = node2;
        }
        this.idNumber = count;
        count++;
        c1.add(this);
    }
    
    public Node[] getNodes(){
        Node [] a = {node1,node2};
        return a;
    }
    
    public double getVoltage(){
        return voltage;
    }
    @Override
    public String toString(){
        return "V" + idNumber +" "+ node1 +" " + node2 +" DC " + voltage;
    }
    
}
