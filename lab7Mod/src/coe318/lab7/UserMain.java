/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoang
 */
package coe318.lab7; //package or file location
import java.util.*; //imports all java classes such as the  Scanner class and the ArrayList class
import java.io.*; // imports standard java input and output

public class UserMain implements UserInterface{ //Main class that includes a main method and implements the UI class
    Scanner sc = new Scanner(System.in); //creates a new scanner object named sc
    String a = ""; //empty string
    Circuit c1 = Circuit.getInstance(); //creates a circuit object
    
    public void start() //start method
    {
        display(); //calling the display method
        run(); //calling the run method
    }
    
    public void run() //the run method is where all of the users input is beign handled
    {
        while(true){ //continuous while loop which will only end if the user ends it
            a = sc.next(); //continuously asks for user input
            if(a.equals("end")){ //the program will first call the end method, then break the while statement
                end();
                break;
            }
            if(a.equals("spice")){ //if the user enters spice it will call the spice method
                spice();
            }
            if(a.equals("r")){ //getting user input for a resistor
                int b = sc.nextInt();
                int c = sc.nextInt();
                double d = sc.nextDouble();
                Node e = new Node(b),f = new Node(c); //creates new nodes with specified node position
                Devices r = new Resistor(e,f,d); //creates a Device object, the device class inherits the resistor class
                c1.add(r); //adds the object to the circuit
            }
            if(a.equals("v")){ //getting input for a voltage source
                int b = sc.nextInt();
                int c = sc.nextInt();
                double d = sc.nextDouble();
                Node e = new Node(b),f = new Node(c); //creates new nodes at the specified position
                Devices v = new Voltage(e,f,d); // creates a Device object, the device class inherits the voltage class
                c1.add(v); // adds object to the cirvuit
            }
        }
    }
    
    public void display() //display method
    {
        System.out.println("Enter your input:");
    }
    
   public void spice() //spice method, prints out the toString() of the circuit object
   {
       System.out.println(c1);
    }
   
   public void end() //end method
   {
       System.out.println("All Done");
   }
   
   public static void main(String[] args) //main method
   {
       UserMain m = new UserMain(); //creates a UI bject and the starts it
       m.start();
   }
}

/*      Scanner sc = new Scanner(System.in);
        String a = "";
        Circuit c1 = Circuit.getInstance();
    
        while(true){
            a = sc.next();
            if(a.equals("end")){
                System.out.println("All Done");
                break;
            }
            if(a.equals("spice")){
                System.out.println(c1);
            }
            if(a.equals("r")){
                int b = sc.nextInt();
                int c = sc.nextInt();
                double d = sc.nextDouble();
                Node e = new Node(b),f = new Node(c);
                Devices r = new Resistor(e,f,d);
                c1.add(r);
            }
            if(a.equals("v")){
                int b = sc.nextInt();
                int c = sc.nextInt();
                double d = sc.nextDouble();
                Node e = new Node(b),f = new Node(c);
                Devices v = new Voltage(e,f,d);
                c1.add(v);
            }
        }*/