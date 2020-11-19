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
public class VipPassenger {
     String name;
    int vip;
    
    VipPassenger( String nm, int vip){
        this.vip =vip;
         name = nm;
    }
    
    public void info(){
            System.out.println("Passenger name: "+name+" VIP#: "+vip);
    }
}
