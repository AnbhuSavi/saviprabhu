import java.io.*;
import java.util.*;

public class StringReverse
 {
   public static void main(String[] args) {
      String s;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the string");
      s=sc.nextLine();
      char[] a =s.toCharArray();
      for (int i =a.length-1;i>=0;i--)
       System.out.print(a[i]);
   }
}
