/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author hoang
 */
public class Node {
    
    private int idNumber;
    private static int count = 0;
    
    public Node(){
        this.idNumber = count;
        count++;
    }
    @Override
    public String toString(){
        return "" + this.idNumber;
    }
}
