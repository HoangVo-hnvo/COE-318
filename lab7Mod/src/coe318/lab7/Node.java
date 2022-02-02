/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7; // package location
/**
 *
 * @author hoang
 */
public class Node { //node class
    
    int idNumber; //idNumber
    
    public Node(int a){ //constructor takes an int as a parameter
        this.idNumber = a;
    }
    
    @Override
    public String toString(){ //toString method, prints a description of the object
        return "" + this.idNumber;
    }
}
