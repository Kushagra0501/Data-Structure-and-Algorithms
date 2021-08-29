import java.util.*;
public class l003
{
    public static Scanner cin = new Scanner(System.in);
    public static int digitCount(int n)
    {
        int count = 0;
        while(n!=0)
        {
           n/=10;
           count++;
        }
        return count;
    }
    public static void printInReverseOrder(int n)
    {
        while(n!= 0)
        {
            int rem  = n%10;
            n/=10;
            System.out.println(rem);
        }
    }
    
    public static int powerFunc(int n)
    {
        n/=10;
        int pow = 1;
        while(n!= 0)
        {
            pow *= 10;
            n/=10;

        }
        return pow;

    }
    public static void printInOrder(int m )
    {
             int pow = powerFunc(m);
           
             while (pow != 0)
             {
                 int quo  = m/ pow;
                 m %=pow;
                 pow/=10;
                 System.out.println(quo);

             }
   }
   
   public static int rotateNumber(int n  , int r)
   {
       int digit =digitCount(n);
      r %= digit;
      if(r<0)
        r+= digit;

       int mul = 1;
       int div = 1;
       for(int i = 1  ; i <= digit ; i++)
       {
           if(i <= r)
           div *=10;
           else
           mul *=10;
       }

       int a = n % div;
       int b = n/div;
       return ( a*mul +b );
   }
    public static void main(String args[])
    {
        int n = cin.nextInt(); 
        int r = cin.nextInt();

       // printInOrder(m);
      System.out.println(rotateNumber(n , r));


    }
}