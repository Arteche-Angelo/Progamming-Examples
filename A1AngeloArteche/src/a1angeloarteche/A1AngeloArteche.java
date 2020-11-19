/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1angeloarteche;

import java.util.Scanner;

/**
 *
 * @author angelo
 */
public class A1AngeloArteche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarArray cars = new CarArray(50);
        Scanner Scan = new Scanner(System.in);

        String arrPlate[] = {"OZPX266", "C6KDNZV", "8Y71QCX", "HLMKZA1", "OXIF1WA", "6VWHXZH", "V1SHHS9", "3T7H06R", "CWPTZYE", "V4HAHPI"};
        String arrModel[] = {"F8 Spider", "Roma", "M2 CS", "M8 Gran Coupe", "Charger GT", "Charger SRT Hellcat Widebody", "GT", "Elva", "Setnra", "Versa"};
        String arrColor[] = {"Red", "Blue", "Orange", "Yellow", "Black", "Red", "Blue", "Orange", "Yellow", "Black"};
        String arrCompany[] = {"Ferrari", "Ferrari", "BMW", "BMW", "Dodge", "Dodge", "McLaren", "McLaren", "Nissan", "Nissan"};
        String arrYear[] = {"2020", "2020", "2020", "2020", "2020", "2019", "2019", "2019", "2019", "2019"};

        for (int i = 0; i < arrPlate.length; i++) {
            cars.insert(arrPlate[i], arrModel[i], arrColor[i], arrCompany[i], arrYear[i]);
        }

        char choice = 'z';

        while (choice != 'E') {
            String plt, mod, clr, comp, yr;
            menu();
            choice = Scan.nextLine().charAt(0);
            switch (choice) {
                case 'l':
                case 'L':
                  cars.display();
                  break;
                case 'i':
                case 'I':
                   
                    System.out.println("enter plate #:");
                    plt =Scan.nextLine();
                    System.out.println("enter model:");
                    mod =Scan.nextLine();
                    System.out.println("enter color:");
                    clr =Scan.nextLine();
                    System.out.println("enter company :");
                    comp =Scan.nextLine();
                    System.out.println("enter year:");
                    yr =Scan.nextLine();
                    cars.insert(plt, mod, clr, comp, yr);                    
                   break;
                case 'S':
                case 's':
                    System.out.println("enter plate # to find");
                    plt = Scan.nextLine();
                    cars.find(plt);
                    break;
                case 'd':
                case 'D':
                    System.out.println("enter plate # to delete");
                    plt = Scan.nextLine();
                    cars.delete(plt);
                    break;
                case 'c':
                case 'C':
                    System.out.println("enter color");
                    clr = Scan.nextLine();
                    cars.findByColor(clr);
                    break;
                case 'm':
                case 'M':
                    System.out.println("enter model");
                    mod=Scan.nextLine();
                    cars.findByModel(mod);
                    break;
                case 'E':
                    break;
                case 'e':
                    choice = 'E';

                
            }
        }

    }

    public static void menu() {
        
        System.out.println("***Menu****");
        System.out.println("1-Disp(l)ay");
        System.out.println("2-(I)nsert");
        System.out.println("3-(S)earch");
        System.out.println("4-(D)elete");
        System.out.println("5-Find all cars of same (c)olor");
        System.out.println("6-find all cars of the same (m)odel");
        System.out.println("7-(e)xit");
        System.out.println("*******************");
        System.out.println("Enter the character of your choice");
        
    }
}
