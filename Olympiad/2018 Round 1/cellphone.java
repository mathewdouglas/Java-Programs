import java.io.*;
import java.util.*;

public class cellphone {
	static int daytime;
	static int evening;
	static int weekend;
	static int cost;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		daytime = input.nextInt();
		evening = input.nextInt();
		weekend = input.nextInt();
		
      if (daytime >= 100) {
         cost += ((daytime - 100) * 80);
      }
      
      cost += evening * 70;
      cost += weekend * 50;
		
		System.out.println(cost + "c");
	}
}
