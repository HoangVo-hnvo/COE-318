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
public class Node {
    
    Circuit c1 = Circuit.getInstance();
    
    int idNumber;
    static int count = 0;
    
    public Node(){
        idNumber = count;
        count++;
        c1.add(this);
    }
    @Override
    public String toString(){
        return "" + this.idNumber;
    }
}

