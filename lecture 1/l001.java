import java.util.*;
public class l001
{
    public static Scanner cout = new Scanner(System.in);
    public static void table (int n)
    {
     for (int i=1 ; i<=10 ; i++)
     {   
         System.out.println ( n + " * " + i + " = " + n*i);
        
     }
     System.out.println();
         }
   
   public static void MultTable(int m )
   {
       for(int i = 1 ; i<m ;i++)
       {
           table(i);
       }
   }
   
    public static void main(String[] args)  
    {
        System.out.println(" Enter the number");
        int num = cout.nextInt();
       MultTable(num);
       
    }
}