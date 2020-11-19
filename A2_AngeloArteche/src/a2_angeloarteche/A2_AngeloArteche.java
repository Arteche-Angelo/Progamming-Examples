/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2_angeloarteche;
import java.util.Scanner;
/**
 *
 * @author angelo
 */
public class A2_AngeloArteche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BaggageStack bs = new BaggageStack(100);
        PassengerQueue pq = new PassengerQueue (50);
        VipPassengerQueue vpq = new VipPassengerQueue(10);
        Scanner Scan = new Scanner(System.in);
        
        int choice = 0;
        
        while (choice != 5){
            String nam, vip;
            int bag,numb;
            menu();
           choice = Scan.nextInt();
           switch (choice){
               case 1:
                   System.out.println("enter passenger name");
                   nam= Scan.next();
                   System.out.println("is Passenger VIP(Y/N)");
                   vip = Scan.next();
                   if (vip.equalsIgnoreCase("y")){
                       System.out.println("Enter VIP Number");
                       numb =Scan.nextInt();
                       VipPassenger vps = new VipPassenger(nam , numb);
                       vpq.insert(vps);
                       System.out.println("the Following Vip Passenger entered the queue");
                       vps.info();
                       break;
                   }else if(vip.equalsIgnoreCase("n")){
                       System.out.println("enter # of baggage");
                       bag = Scan.nextInt();
                       Passenger ps = new Passenger(nam, bag);
                       pq.insert(ps);
                       System.out.println("the follwoing Regular passenger entered the Regular queue");
                       ps.info();
                       break;
                   }
                   
               case 2:  
                   if (pq.isEmpty()){
                       System.out.println("no passenger in Regular queue");
                       break;
                   }
                   System.out.println("the following passenger was removed from the Regular queue");
                   pq.peekFront().info();
                   for(int i=0;i<pq.peekFront().baggage;i++){
                   bs.push(pq.peekFront());
                   System.out.println("A baggage with name "+pq.peekFront().name+" was enterd into the Baggage Stack");
                   
                   }
                   pq.remove();
                   break;
                   
               case 3: 
                   if (vpq.isEmpty()){
                       System.out.println("no passenger in vip queue");
                       break;
                   }
                   System.out.println("the following vip passenger removed the vip Queue");
                   vpq.peekMin().info();
                   vpq.remove();
                   break;
                   
               case 4:
                   if(bs.isEmpty()){
                       System.out.println("baggage stack is empty");
                       break;
        }
                     
                   for(int i=0;i<bs.peek().baggage;i++){
                       System.out.println("A baggage with name "+ bs.peek().name+" was removed from the baggage stack");
                       
                   }
                   if(bs.peek().baggage==2){
                   bs.pop();
                   bs.pop();
                   }else 
                       bs.pop();
                   break;
                   
               case 5:
                   choice = 5;
                   break;
           }
    }
    
    
    
    
}

public static void menu (){
     System.out.println("****************Menu****************");
        System.out.println("1- New Passenger Arrived");
        System.out.println("2- Check in Regular Passenger");
        System.out.println("3- Check in Vip Passenger");
        System.out.println("4- Check out Regular passenger baggage");
        System.out.println("5- Quit");
        System.out.println("select an option(1-5");
     System.out.println("************************************");
    }
}