/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoang
 */
import java.util.*;
import java.io.*;

public class UserMain implements UserInterface{
    Scanner sc = new Scanner(System.in);
    String a = "";
    Circuit c1 = Circuit.getInstance();
    
    public void start()
    {
        display();
        run();
    }
    
    public void run()
    {
        while(true){
            a = sc.next();
            if(a.equals("end")){
                end();
                break;
            }
            if(a.equals("spice")){
                spice();
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
        }
    }
    
    public void display()
    {
        System.out.println("Enter your input:");
    }
    
   public void spice()
   {
       System.out.println(c1);
    }
   
   public void end()
   {
       System.out.println("All done");
   }
   
   public static void main(String[] args)
   {
       UserMain m = new UserMain();
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