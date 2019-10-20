import java.io.*;
import java.util.*;

public class perfect {
	static int num;
	static String output;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
      int factorSum = 0;
      
      for (int i = 1; i < num; i++) {
         if (num % i == 0) {
            factorSum += i;
         }
      }
      
      if (factorSum < num) {
         output = "Deficient";
      } else {
         if (factorSum > num) {
            output = "Abundant";
         } else {
            output = "Perfect";
         }
      }
		
		System.out.println(output);
	}
}