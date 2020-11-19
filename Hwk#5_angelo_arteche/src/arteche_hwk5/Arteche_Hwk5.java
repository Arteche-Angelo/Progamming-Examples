/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arteche_hwk5;

import java.io.*;
import java.util.*;

/**
 *
 * @author angelo
 */
public class Arteche_Hwk5 {

    static int counter = 1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Employee ppl[] = new Employee[20];
        Scanner filein;
        filein = new Scanner(new File("Employee.txt"));
        while (filein.hasNext()) {
            String lname = filein.next();
            String fname = filein.next();
            String dept = filein.next();

            Employee emp = new Employee(lname, fname, dept);
            ppl[counter] = emp;
            counter++;
        }

        /* im pretty sure the print methods i used arent what was asked of in the homework,so i understand if i 
        lose points for it, but it was the only way i could come up with to make it work*/
        System.out.println("Print All\n");
        for (int index = 1; index < counter; index++) {
            printAll(ppl[index]);
        }
        System.out.println("\nPrint Staff\n");
        for (int index = 1; index < counter; index++) {
            printDepartment("Staff", ppl[index]);
        }
        System.out.println("\nPrint Macomb Employees\n");
        for (int index = 1; index < counter; index++) {
            printLocation("Macomb", ppl[index]);
        }

    }

    public static void printAll(Employee ppl) {

        System.out.println(ppl.ToString());

    }

    public static void printDepartment(String dpt, Employee ppl) {

        /* the if statement checks if the department of the object passed
        is equal to the department for which we want to print out all employess of.
        So if the department of the employee matches the desired departmen,
        then it will print out that employess information. its the same concept
        for the print location method
         */
        if (ppl.getDept().equals(dpt)) {
            System.out.println(ppl.ToString());
        }
    }

    public static void printLocation(String loc, Employee ppl) {
        if (ppl.getLocation().equals(loc)) {
            System.out.println(ppl.ToString());
        }
    }

}
