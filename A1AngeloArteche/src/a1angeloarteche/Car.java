/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1angeloarteche;

/**
 *
 * @author angelo
 */
public class Car {
    String plate;
    String model;
    String color;
    String company;
    String year;
    
    Car(String plt, String mod, String clr, String comp, String yr){
        plate = plt;
        model = mod;
        color= clr;
        company = comp;
        year = yr;
    }
    
    public String info(){
        return plate+" "+ color+" "+ model+" "+ company+" "+year ;
    }
    
}
