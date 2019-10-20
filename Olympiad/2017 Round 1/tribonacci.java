import java.io.*;
import java.util.*;

public class tribonacci {
	static int first, second, third;
	static int n;
	static int value;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		first = input.nextInt();
		second = input.nextInt();
		third = input.nextInt();
		n = input.nextInt();
		int temp = 0;
      
      for (int i = 4; i <= n; i++) {
         temp = third;
         third = (first + second + third);
         first = second;
         second = temp;
      }
      value = third;
		
		System.out.println(value);
	}
}