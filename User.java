
import java.util.Scanner;

public class User {

    public static double bankBalnce = 0.0;

    private int UserChoice;

    Scanner scanner = new Scanner(System.in);


    public User(int UserChoice){
        this.UserChoice = UserChoice;

    } 

    public int getUserChoice(){
        return UserChoice;

    } 

    public void showMenuResponse(){
        if (UserChoice == 1){

        System.out.println("print the balance");
        System.out.println(bankBalnce);

        } else if (UserChoice == 2){

        System.out.println("how match would you like to dipo?");
        int dipo  = scanner.nextInt();
        bankBalnce += dipo;
        System.out.println("Successfully dipo. New balance: $" + bankBalnce);


        }else if (UserChoice == 3){

            System.out.println("how match would you like to withdraw?");
            int withdraw  = scanner.nextInt();
            bankBalnce -= withdraw; 
            System.out.println("Successfully withdrawn. New balance: $" + bankBalnce);
        
            
        } else if (UserChoice == 4){
            bankBalnce = 0.0;
        }
        
        else
            System.out.println("typo");
        }
       }
    

    
    

    
    
