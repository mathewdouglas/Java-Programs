import java.io.*;
import java.util.*;

public class marbles2 {
	static int n;
	static ArrayList<Integer> marbles = new ArrayList<>();
	static int buy;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		for (int _i = 0; _i < n; _i++) {
			marbles.add(input.nextInt());
		}
		
      int high = 0;
      
      for (int k = 0; k < n; k++) {
         if (marbles.get(k) > high) {
            high = marbles.get(k);
         }
      }
      
      for (int l = 0; l < n; l++) {
         buy += (high - marbles.get(l));
      }
         
		
		System.out.println(buy);
	}
}