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
public class BaggageStack {
    private Passenger[] baggageStack;
    private int maxSize ;
    private int top;
    
    BaggageStack(int s){
        baggageStack = new Passenger[s];
        maxSize = s;
        top = -1;
    }
    
    public void push(Passenger ps){
    baggageStack[++top]= ps;
}
    public Passenger pop(){
    return baggageStack[top--];
}
    public Passenger peek(){
    return baggageStack[top];
}
    public boolean isEmpty(){
    return (top==-1);
}
    public boolean isFull(){
    return (top==maxSize -1);
}
}
