import javax.swing.*;
public class ReadNumbers{
   public static void main (String[] args){
      System.out.println("Enter 5 numbers");
      inputNums();
   }
   
   public static void inputNums (){
      int num;
      
      for (int i = 1; i <= 5; i++){
         num = Integer.parseInt(JOptionPane.showInputDialog("Please enter the " + i + "th number"));
      }
   }
}