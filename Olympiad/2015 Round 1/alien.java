import java.io.*;
import java.util.*;

public class alien {
	static int n;
	static ArrayList<Integer> froogon = new ArrayList<>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		// YOUR CODE HERE
		
		for (int _i = 0; _i < froogon.size(); _i++) {
			System.out.print(froogon.get(_i));
			System.out.print(_i == froogon.size()-1 ? '\n' : ' ');
		}
	}
}