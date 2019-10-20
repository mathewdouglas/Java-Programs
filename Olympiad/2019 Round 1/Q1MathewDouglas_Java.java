import java.util.*;

public class Q1MathewDouglas_Java {
   public static void main(String[] args) {
      Scanner scStr = new Scanner (System.in);
      int num[] = {scStr.nextInt(), scStr.nextInt(), scStr.nextInt()};
      scStr.close();
      
      int sum = 0;
      
      for(int a = 0; a < 3; a++) {
         sum += num[a];
      }
      
      if(sum != 180) {
         System.out.println("IMPOSSIBLE");
         System.exit(0);
      }
      
      sum = 0;
      if(num[0] == num[1]) sum++;
      if(num[1] == num[2]) sum++;
      if(num[2] == num[0]) sum++;
      
      switch(sum) {
         case 1:
            System.out.println("ISOSCELES");
            break;
         case 0:
            System.out.println("SCALENE");
            break;
         case 3:
            System.out.println("EQUILATERAL");
            break;
      }
   }
}