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
public class CarArray {

    private Car[] arrCar;
    private int nElems = 0;

    CarArray(int size) {
        arrCar = new Car[size];
        nElems = 0;
    }

    //display********************************************
    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.println(i + 1 + "- " + arrCar[i].info());

        }
    }

    //insert************************************************
    public void insert(String plt, String mod, String clr, String comp, String yr) {
        arrCar[nElems] = new Car(plt, mod, clr, comp, yr);
        nElems++;
    }

    //find******************************************************
    public void find(String searchKey) {
        int j = 0;
        for (j = 0; j < nElems; j++) {
            if (arrCar[j].plate.equals(searchKey)) {
                System.out.println(arrCar[j].info());
            }
        }


    }

    //delete***************************************************
    public void delete(String plate) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (arrCar[j].plate.equals(plate)) {
                System.out.println("car with plate "+arrCar[j].plate+" was deleted");
               for (int k = j; k < nElems; k++) {
            arrCar[k] = arrCar[k + 1];                 
               }
               nElems--;
            }
        }            
    }

    //find by color*********************************************
    public void findByColor(String color) {
        for (int j = 0; j < nElems; j++) {
            if (arrCar[j].color.equals(color)) {
                System.out.println( arrCar[j].info());
            }
        }
        
    }

    //find by model**********************************************
    public void findByModel(String Model) {
        for (int j = 0; j < nElems; j++) {
            if (arrCar[j].model.equals(Model)) {
                System.out.println( arrCar[j].info());
            }
        }
        
    }

}
