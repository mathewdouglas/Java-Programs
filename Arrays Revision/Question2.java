import javax.swing.*;
public class Question2 {
   static String Results[] = new int[20];
   static String SplitArr[];
   static String Grade12[];
   
   public static void main (String[] args) {
      DataIn();
   }
   
   public static void DataIn() {
      for (int i = 0; i < 20; i++) {
         Results[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter a result (format is Initial.Surname Grade Mark(out of 100)"));
      }
   }
   
   public static String Highest() {
      
   }
   
   public static void Extract() {
      
   }
   
   public static void Display(int tempArr[], int size) {
      for (int i = 0; i <= size; i++) {
         System.out.println(tempArr[i]);
      }
   }
}