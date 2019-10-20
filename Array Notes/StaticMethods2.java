import javax.swing.*;
public class StaticMethods2 {
   static int numArr[] = new int[5];
   static int len = numArr.length;
   
   public static void main (String[] args) {
      getNumbers();
      System.out.println(largest());
      System.out.println(secondLast());
      displayReverse();
   }
   
   public static void getNumbers() {
      for (int i = 0; i < len; i++) {
         numArr[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
      }
   }
   
   public static int largest() {
      int largest = numArr[0];
      
      for (int i = 1; i < len; i++) {
         if (numArr[i] > largest) {
            largest = numArr[i];
         }
      }
      
      return largest;
   }
   
   public static int secondLast() {
      int secLast = numArr[len-2];
      
      return secLast;
   }
   
   public static void displayReverse() {
      for (int i = len-1; i >= 0; i--) {
         System.out.println(numArr[i]);
      }
   }
}