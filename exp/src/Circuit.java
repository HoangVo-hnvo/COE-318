
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoang
 */
public class Circuit {
     
    private static Circuit instance = null;
    public ArrayList <Devices> devices;
    
    public static Circuit getInstance() {
        if (instance == null) {
            instance = new Circuit();
        }
        return instance;
    }
    
    private Circuit() {
        this.devices = new ArrayList<Devices>();
    } //Yes, the constructor is PRIV
    
    public void add(Devices e){
        this.devices.add(e);
    }
    
    public String toString(){
        String a = "";
        for(int i=0;i< devices.size();i++){
            a+= "" + devices.get(i)+ "\n";
        }
        return a;
    }
}
