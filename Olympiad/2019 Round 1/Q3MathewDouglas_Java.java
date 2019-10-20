import javax.swing.*;
public class Q3MathewDouglas_Java {
   public static void main(String[] args) {
      String W = JOptionPane.showInputDialog("Enter a string");
      String nums[] = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
      String out = "NONE";
            
      char[] lets = null;
      int size = 0;
      int num = 0;
      boolean found = false;
      
      if (W.length() >= 3) {
         for(int a = 0; a < nums.length; a++) {
            size = 0;
            lets = nums[a].toCharArray();
            
            for(int b = 0; b < W.length(); b++) {
               if(W.charAt(b) == lets[size]) {
                  size++;
               }
               
               if(size == lets.length) {
                  found = true;
                  break;
               }
            }
            
            if (found) {
               out = nums[a];
               break;
            }
         }
      }
      System.out.println(out);
   }
}