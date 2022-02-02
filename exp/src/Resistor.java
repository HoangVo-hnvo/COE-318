/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoang
 */

public class Resistor extends Devices {
    
    private double resistance;
    Node node1,node2;
    int idNumber;
    static int count = 1;
    
    public Resistor( Node node1, Node node2, double resistance){
        if (resistance < 0) {
            throw new IllegalArgumentException("i can't be negative");
        }
        if(node1 == null || node2 == null) {
            throw new IllegalArgumentException("s can't be null");
        }

        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.idNumber = count;
        count ++;
    }
    
    public Node[] getNodes(){
        Node [] a = {node1,node2};
        return a;
    }
    @Override
    public String toString(){
        return "R" + idNumber +" "+ node1 +" " + node2 +" " + resistance;
    }
    
}