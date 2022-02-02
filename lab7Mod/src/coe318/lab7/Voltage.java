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

public class Voltage extends Devices{ // the voltage class is a part of the device class
    
    //instance variables
    private double voltage;
    Node node1,node2;
    int idNumber;
    static int count = 1;
    
    public Voltage( Node node1, Node node2, double voltage){ //constructor with parameters
        if(node1 == null || node2 == null) { //makes sure that nodes are not null
            throw new IllegalArgumentException("s can't be null");
        }
        if(voltage < 0){ //an if statement which accounts for polarity
            this.voltage = -1*voltage; 
            this.node1 = node2;
            this.node2 = node1;
        }
        else{ // if the source isn't polarized we can poceed as intended
            this.voltage = voltage;
            this.node1 = node1;
            this.node2 = node2;
        }
        this.idNumber = count++;
    }
    
    public Node[] getNodes(){ //getter method for the objects nodes
        Node [] a = {node1,node2};
        return a;
    }
    
    public double getVoltage(){ //returns the objects instance variable, voltage
        return voltage;
    }
    @Override
    public String toString(){ // returns a description of the object
        return "V" + idNumber +" "+ node1 +" " + node2 +" DC " + voltage;
    }
    
}
