/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arteche_hwk2;
import javafx.scene.text.Text; 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Random;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
/**
 *
 * @author angelo
 */
public class Arteche_Hwk2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Rectangle r = new Rectangle(0,0,800,500);  
         r.setFill(Color.YELLOW);
         
         
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
         BankAccount Account = new BankAccount("ANGLEO","ARTECHE","X976SDF",5000);
        Random RanDeposit = new Random();
        Random RanWithdrawal = new Random();
        double deposit;
        deposit = RanDeposit.nextDouble()+RanDeposit.nextInt(5000);
        double withdrawal;
        withdrawal = -RanWithdrawal.nextDouble()+RanWithdrawal.nextInt(-2000);
        
        Account.setDeposit(deposit);
        Account.setWithdrawal(withdrawal);
        
         
        
    }
    
}
