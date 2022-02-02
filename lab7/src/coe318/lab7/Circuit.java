/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author hoang
 */
public class Circuit {
     
    private static Circuit instance = null;
    ArrayList <Node> nodes= new ArrayList<Node>();
    ArrayList components = new ArrayList();
    
    public static Circuit getInstance() {
        if (instance == null) {
            instance = new Circuit();
        }
        return instance;
    }
    
    private Circuit(){}
    //Yes, the constructor is PRIV
    
    public void add(Resistor r){
        components.add(r);
    }
    public void add(Voltage v){
        components.add(v);
    }
    public void add(Node n){
        nodes.add(n);
    }
    
    public String toString(){
        String a = "";
        for(int i=0;i< components.size();i++){
            a+= "" + components.get(i)+ "\n";
        }
        return a;
    }
}
