import javax.swing.*;
public class StaticMethods5 {
   static String monthsArr[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};
   static int readingsArr[] = new int[6];
   static int len = 6;
   
   public static void main (String[] args) {
      input();
      display();
   }
   
   public static void input() {
      for (int i = 0; i < len; i++) {
         readingsArr[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the reading for the month of " + monthsArr[i]));
      }
   }
   
   public static void display() {
      for (int i = 0; i < len; i++) {
         System.out.println(monthsArr[i] + " " + readingsArr[i]);
      }
   }   
}