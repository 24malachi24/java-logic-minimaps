import java.util.Scanner;

/**
 * Write a description of class FibonnacciTester here.
 *
 * @Malachi Robinson
 * @YDY946
 */
public class FibonnacciTester

{ 
   public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);
    int f= 0;
    while(true){
     System.out.println("Enter the value of n:");
     if(s.hasNextInt()){
         f = s.nextInt();
         Fibonacci fibo = new Fibonacci(f);
         System.out.println("The current Fibo Number is " + fibo.getFiboNumber());
     } else {
    
    System.out.println("The value you entered is incorrect, Exit");
    break;
    
    }
    
    
    
    
    
    } 
    
    
}
}
