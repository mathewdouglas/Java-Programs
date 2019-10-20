import javax.swing.*;
public class DrawRectangle{
   public static void main (String[] args){
      int len = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of stars in the length"));
      int bth = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of stars in the breadth"));
      drawRectangle(len, bth);
   }
   
   public static void drawRectangle (int l, int b){
      for (int i = 1; i <= b; i++){
         for (int k = 1; k <= l; k++){
            System.out.print("*");
         }
         
         System.out.println("");
      }
   }
}