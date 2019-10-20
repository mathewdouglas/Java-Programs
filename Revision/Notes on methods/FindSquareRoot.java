import javax.swing.*;
public class FindSquareRoot{
   public static void main (String[] args){
      int num = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
      System.out.println(findSquareRoot(num));
   }
   
   public static double findSquareRoot (int n){
      double sqrt = Math.sqrt(n);
      return sqrt;
   }
}