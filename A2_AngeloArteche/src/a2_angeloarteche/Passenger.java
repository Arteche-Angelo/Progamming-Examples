/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2_angeloarteche;

/**
 *
 * @author angelo
 */
public class Passenger {
    String name;
    int baggage;
    
     Passenger (String nm,int bg){
        name = nm;
        baggage =bg;
    }
     
     public void info(){
         System.out.println("Passenger name: "+ name+" Number of baggage: "+baggage);
     }
}
