/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;
import java.util.ArrayList;
/**
 *
 * @author hoang
 */
public class Circuit {
     
    private static Circuit instance = null;
    private ArrayList <Resistor> resistors;
    
    public static Circuit getInstance() {
        if (instance == null) {
            instance = new Circuit();
        }
        return instance;
    }
    
    private Circuit() {
        this.resistors = new ArrayList<Resistor>();
    } //Yes, the constructor is PRIV
    
    public void add(Resistor r){
        this.resistors.add(r);
    }
    public String toString(){
        String a = "";
        for(int i=0;i< resistors.size();i++){
            a+= "" + resistors.get(i)+ "\n";
        }
        return a;
    }
}
