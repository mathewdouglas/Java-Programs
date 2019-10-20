import javax.swing.*;
public class ReadNames{
   public static void main (String[] args){
      System.out.println("Enter 5 names");
      inputNames();
   }
   
   public static void inputNames (){
      String name;
      
      for (int i = 1; i <= 5; i++){
         name = JOptionPane.showInputDialog("Please enter the " + i + "th name");
      }
   }
}