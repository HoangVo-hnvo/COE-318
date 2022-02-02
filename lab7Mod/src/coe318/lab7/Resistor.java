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

public class Resistor extends Devices { //the resistor class is a part of the devide class
    
    //instance variables
    private double resistance; 
    Node node1,node2;
    int idNumber;
    static int count = 1;
    
    public Resistor( Node node1, Node node2, double resistance){ //constructor with parameters
        if (resistance < 0) { //a fail safe in place to make sure resistance isn't negative 
            throw new IllegalArgumentException("r can't be negative");
        }
        if(node1 == null || node2 == null) { //makes sure that nodes can't be empty
            throw new IllegalArgumentException("s can't be null");
        }
        
        //intializing instance variables
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.idNumber = count;
        count ++;
    }
    
    public Node[] getNodes(){ //get node method, returns the objects nodes
        Node [] a = {node1,node2};
        return a;
    }
    @Override
    public String toString(){ //toString method provides a description of the object
        return "R" + idNumber +" "+ node1 +" " + node2 +" " + resistance;
    }
    
}