import java.util.ArrayList;
import java.util.Arrays;

import org.junit.runner.*;
import org.junit.runner.notification.Failure;

public class BankAccount {
    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int withdraw(int amount) throws InsufficientFundsException{
        try {
            if (amount < balance){
                balance = balance - amount;
                System.out.println("Your Current Balance is - ");
                return balance;
            }
            else{
                throw new InsufficientFundsException("Insuffiecient Funds \n Your currnt Balance is = "+balance);
            }
            
        }
        finally{
            System.out.println();
        }
        
    }
    
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(BankAccountTest.class);
       
        for(Failure failure: result.getFailures()){
            System.out.println(failure.toString());
        }

        System.out.println("Result => "+ result.wasSuccessful());
        
    }
}
