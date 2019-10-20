import javax.swing.*;
import java.util.*;
public class Q2_2MathewDouglas_Java {
   public static void main(String[] args) {
      int n = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
      
      int count = 0;
      int num = 1;
      
      while (count < n) {
         num++;
         
         if (isTruncated(num)) {
            count++;
         }
      }
      
      System.out.println("n: " + n + " is " + num);
   }
      
   public static boolean isPrime(int num) {
      if(num == 1) {
         return false;
      }
      
      for(int a = 2; a < (num / 2 + 1); a++) {
         if(num % a == 0) {
            return false;
         }
      }
      
      return true;
   }
   
   public static boolean isTruncated(int num) {
      for(int a = (num + "").length(); a > 0 ; a--) {
         if(!isPrime( Integer.parseInt((num + "").substring(0, a)))) {
            return false;
         }
      }
      return true;
   }
}