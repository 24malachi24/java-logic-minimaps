
/**
 * Write a description of class Fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fibonacci
{
    // instance variables - replace the example below with your own
     int f;

    
    public Fibonacci(int fin)
    {
        
        f = fin;
    }

    
    public long getFiboNumber()
    {
        long fold1 =1;
        long fold2 = 1;
        long fnew = 0;
        for(int i = 3; i<= f; i++){
            fnew = fold1 + fold2;
            fold1 =fold2;
            fold2 = fnew;
        }
        
        return fnew;
    }
}
