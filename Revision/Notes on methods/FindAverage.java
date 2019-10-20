import javax.swing.*;
public class FindAverage{
   public static void main (String[] args){
      System.out.println("Enter 7 numbers to find the average of them");
      System.out.println(findAverage());
   }
   
   public static double findAverage (){
      int num = 0;
      int sum = 0;
      double avg = 0.0;
      
      for (int i = 1; i <= 7; i++){
         num = Integer.parseInt(JOptionPane.showInputDialog("Please enter the " + i + "th number"));
         sum += num;
      }
      
      avg = (1.0 * sum)/7;
      return avg;
   }
}