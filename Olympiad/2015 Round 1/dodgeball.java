import java.io.*;
import java.util.*;

public class dodgeball {
	static int n, k, l;
	static ArrayList<Integer> balls = new ArrayList<>();
	static String answer;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		k = input.nextInt();
		l = input.nextInt();
		for (int _i = 0; _i < l; _i++) {
			balls.add(input.nextInt());
		}
		// YOUR CODE HERE
		
		System.out.println(answer);
	}
}