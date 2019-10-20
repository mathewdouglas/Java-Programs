import java.io.*;
import java.util.*;

public class simpleinterest {
	static int initial_amount;
	static float rate;
	static int years;
	static float final_amount;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		initial_amount = input.nextInt();
		rate = input.nextFloat();
		years = input.nextInt();
		
      final_amount = (float)(initial_amount + (initial_amount * (rate/100) * years));
		
		System.out.printf("%.2f", final_amount);
	}
}