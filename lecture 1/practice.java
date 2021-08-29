import java.util.*;

public class practice
{

    public static void fibbo(int n)
    {
        int q = 0;
        for(int i  =  0 ; i < n  ; i++)
        {
            System.out.println(i+q);
            q = i;
         }
    }
    public static void main(String args[])
    {
      fibbo(30);
    }
}