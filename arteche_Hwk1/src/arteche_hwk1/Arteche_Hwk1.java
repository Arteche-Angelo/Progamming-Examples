/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arteche_hwk1;
import java.util.Scanner;
/**
 *
 * @author angelo
 */
public class Arteche_Hwk1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan=new Scanner (System.in);
       String LastName=new String();
       final String OU= "Oakland University";
       //probelm 1 ^^^
       double Gpa;
       int Credits;
       int Tuition;
       char FirstIntial;
       char LetterGrade = 0;
       double TuititonPerCredit;
       //declare all of the variavle
       
       //problem 2
        System.out.println("enter your Gpa on a 4.0 scale.");
        Gpa=scan.nextDouble();
        System.out.println("enter number of credits so far");
       Credits=scan.nextInt();
        System.out.println("enter amount of tution paid");
        Tuition = scan.nextInt();
        scan.nextLine();
        System.out.println("enter you last name");
        LastName=scan.nextLine();
        System.out.println("enter yout first inital");
        FirstIntial=scan.next().charAt(0);
        
        //problem 3; see line 26 to see where LetterGrade was declared and initalized
        if(Gpa < 1)
        LetterGrade='F';
       if(Gpa < 2.5 && Gpa>=1) 
        LetterGrade='D';
       if(Gpa < 3 && Gpa>=2.5)
        LetterGrade='C';
       if(Gpa <= 3.5 && Gpa >=3)
        LetterGrade='B';
       if(Gpa <= 4 && Gpa >3.5)
        LetterGrade='A';
       
       //problem 4; see line 27 to see where TuitionPerCredit was declared
       TuititonPerCredit= (double)Tuition/Credits;
       
       //problem 5
        System.out.println("Student name:\t\t\t"+FirstIntial+". "+LastName+"\nUniversity:\t\t\t"+OU+"\nLetter Gpa Grade:\t\t"+LetterGrade+"\nTuition cost per credit:\t"+TuititonPerCredit);
        
        
        
              
    }
    
}
