/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.*;
/**
 *
 * @author hoang
 */
public class UserMain {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String a = "";
        Circuit c1 = Circuit.getInstance();
        Voltage v;
        Resistor r;
        Node zero = new Node(), one = null, two = null;
        
        while(true){
            a = sc.next();
            
            if(a.equals("r")){
               int node1 = sc.nextInt();
               int node2 = sc.nextInt();
               double resistance =sc.nextDouble();
               if(node1 < Node.count){
                   for(int i =0;i< Node.count;i++){
                       if(c1.nodes.get(i).idNumber == node1){
                           one = c1.nodes.get(i);
                       }
                   }
               }
               else{
                   for(int i=0;i <= (node1-Node.count);i++){
                       one = new Node();
                   }
               }
               if(node2 < Node.count){
                   for(int i =0;i< Node.count;i++){
                       if(c1.nodes.get(i).idNumber == node2){
                           two = c1.nodes.get(i);
                       }
                   }
               }
               else{
                   for(int i=0;i <=(node2-Node.count);i++){
                       two = new Node();
                   }
               }
               r = new Resistor(one,two,resistance);
            //make a new resistance, put it between nodes and put it into the circuit
            }
            if(a.equals("v")){
                int node1 = sc.nextInt();
                int node2  = sc.nextInt();
                double voltage = sc.nextDouble();
                if(node1 < Node.count ){
                   for(int i =0;i< Node.count;i++){
                       if(c1.nodes.get(i).idNumber == node1){
                           one = c1.nodes.get(i);
                       }
                   }
                }
               else{
                    for(int i=0;i <= (node1-Node.count);i++){
                       one = new Node();
                   }
               }
               if(node2 < Node.count){
                   for(int i =0;i< Node.count;i++){
                       if(c1.nodes.get(i).idNumber == node2){
                           two = c1.nodes.get(i);
                       }
                   }
               }
               else{
                   for(int i=0;i <= (node2-Node.count);i++){
                       two = new Node();
                   }
               }
               v = new Voltage(one,two,voltage);
            //make a new voltage source between the nodes
            }
            if(a.equals("end")){
                System.out.println("All Done");
                break;
            }
            if(a.equals("spice")){
                System.out.println(c1);
            }
        }
    }
}
