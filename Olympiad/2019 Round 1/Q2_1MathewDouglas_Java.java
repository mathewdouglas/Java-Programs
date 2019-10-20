import javax.swing.*;
import java.util.*;
public class Q2_1MathewDouglas_Java {
   public static void main(String[] args) {
      int n = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
      
      int count = 0;        
      int num = 1;
      
      while(count < n) {
         num++;
         if(isPrime(num)) { 
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
}