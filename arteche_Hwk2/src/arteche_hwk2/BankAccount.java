/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arteche_hwk2;
import java.text.NumberFormat;
/**
 *
 * @author angelo
 */
public class BankAccount {

    private String fName;
    private String lName;
    private String accountNumber;
    private double balance;
    private double deposit;
    private double withdrawal;

    public BankAccount(String firstName, String lastName, String aNum, double initBal) {

        fName = firstName;
        lName = lastName;
        accountNumber = aNum;
        balance = initBal;
    }

    public String getFullName() {
        String firstName = new String();
        String lastName = new String();
        return lastName + ", " + firstName;

    }

    public void setDeposit(double dep) {
        if (dep > 0) 
            balance = balance + dep;
        else 
            dep = 0;
        
    }
    public void setWithdrawal(double wth){
        if (wth<0)
            balance= balance - wth;
        else
            wth=0;
    }
    
    public String getWithdrawal(){
        NumberFormat fmtCurrency = NumberFormat.getCurrencyInstance();
        return fmtCurrency.format(withdrawal);
    }
    
    public String getDeposit(){
        NumberFormat fmtCurrency = NumberFormat.getCurrencyInstance();
        return fmtCurrency.format(deposit);
    }
    
    public String getBalance(){
        NumberFormat fmtCurrency = NumberFormat.getCurrencyInstance();
        return fmtCurrency.format(balance);
    }
    public String getaccountNumber(){
        return accountNumber;
        
    }
    
    public String toString(){
        return "Account Owner: "+ getFullName()+"\nCurrent Balance: "+getBalance()+
                "\nAccount Number: " +getaccountNumber()+"\nLast Deposit: "+getDeposit()+"\nLast Withdrawal: "+getWithdrawal();
        
    }

}
