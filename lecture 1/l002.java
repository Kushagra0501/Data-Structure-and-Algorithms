import java.util.*;
public class l002
{

public static Scanner cin = new Scanner(System.in);

    public static boolean isEven(int n )
    {
         if (n%2 == 0)
             return true;

    return false;
    }
    
    public static boolean isPrime(int n)
    {
        for(int i = 2 ; i*i <= n; i++)
        {
            if ( (n % i) == 0)
            {
             return false;
            }
            
        }
        return true ;
    }
    
    public static  void multPrimeCheck(int n)
    {
        for(int i=0 ; i < n ; i++)
        {
            System.out.println("Enter the number");
            int num = cin.nextInt();
            boolean res = isPrime(num);
           if(res == true)
        System.out.println("Is Prime");
        else
        System.out.println("Is not Prime");
    
        }
    }

    public static void printPrimeInRange( int low , int high )
    {
        System.out.println();
        for(int i = low+1 ; i <= high ; i++)
        {
            
        boolean res =  isPrime(i);
            if(res == true)
            {
                System.out.println(i);
            }
        }
        
    }
  
  public static void main(String args[])
    {
        System.out.println("Enter the lower number...");
        int low = cin.nextInt(); 
        
        System.out.println("Enter the higher number...");
        int high = cin.nextInt(); 

         printPrimeInRange(low, high);
        //System.out.println(res);
       
     }



}