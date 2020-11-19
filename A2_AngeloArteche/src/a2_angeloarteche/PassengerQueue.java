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
public class PassengerQueue {
    private int  maxSize;
    private Passenger[] PassengerQueueArr;
    private int front;
    private int rear;
    private int nItems;
    
    public PassengerQueue(int s){
        maxSize =s;
        PassengerQueueArr= new Passenger[maxSize];
        front =0;
        rear= -1;
        nItems =0;
        
    }
     public void insert (Passenger j){
        if(rear ==  maxSize -1)
            rear=-1;
        
        PassengerQueueArr[++rear] =j;
        nItems++;
    }
    
    public Passenger remove(){
        Passenger temp = PassengerQueueArr[front++];
        if(front == maxSize)
            front=0;
        nItems--;
        return temp;
            
    }
    public Passenger peekFront(){
        return PassengerQueueArr[front];
    }
    public boolean isEmpty(){
        return (nItems==0);
    }
    
   public boolean isFull(){
       return (nItems==maxSize);
   }
   
   public int size(){
       return nItems;
   }
}
