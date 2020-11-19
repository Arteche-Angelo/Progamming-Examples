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
public class VipPassengerQueue {
    private int maxSize;
    private VipPassenger[] queArray;
    private int nItems;
    
    public VipPassengerQueue(int s){
        maxSize =s;
        queArray = new VipPassenger[maxSize];
        nItems =0;
    }
    
    public void insert (VipPassenger item){
        int j;
        if(nItems==0)
            queArray[nItems++]=item;
        else{
            for(j=nItems -1; j >=0;j--){
                if(item.vip > queArray[j].vip)
                    queArray[j+1]=queArray[j];
                else
                    break;
            }
            queArray[j+1]=item;
            nItems++;
        }
    }
    
    public VipPassenger remove(){
        return queArray[--nItems];
        
    }
    public VipPassenger peekMin(){
        return queArray[nItems-1];
        
    }
    
    public boolean isEmpty(){
        return (nItems ==0);
    }
    
    public boolean isFull(){
        return (nItems == maxSize);
    }
}
