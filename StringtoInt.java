import java.util.Scanner;
import java.io.*;
public class StringtoInt {

   public static void main(String[] args)
   {
     
     int n;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter a number");
     n=s.nextInt();
     Integer result = Integer.valueOf(n);
     System.out.println(result);
     }
     }
