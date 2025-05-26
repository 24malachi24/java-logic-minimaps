
/**
 * Write a description of class AutomaticTeller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class AutomaticTeller
{
private int pinNumber = 0;
    
public AutomaticTeller(int pin){
    
    pinNumber = pin;
    
    }
    public void validateUser(){
    
        Scanner pinScanner = new Scanner(System.in);
        int numberOfAttempts = 0;
        while(numberOfAttempts<3){
        System.out.println("Please eneter your PIN number.");
        int pinAttempt = pinScanner.nextInt();
        if(pinAttempt == pinNumber){
        System.out.println("The Pin number is correct.");
        return;
        
        }
        else {
        System.out.println("The pin number you have entered is incorrect.");
        }
        numberOfAttempts++;{
        System.out.println("Your bank card has been blocked.");
        }
        }
    
    
    
}
}
