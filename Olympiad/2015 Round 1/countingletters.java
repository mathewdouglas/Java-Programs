import java.io.*;
import java.util.*;

public class countingletters {
	static String word;
	static String output;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		word = input.nextLine();
      char let = ' ';
      int num = 0;
      output = "";
		
      for (int i = 0; i < word.length(); i++) {
         let = word.charAt(i);
         num = 0;
         
         if ((output.indexOf(let) < 0)) {
            for (int j = 0; j < word.length(); j++) {
               if (word.charAt(j) == let) {
                  num++;
               }
            }
            output += "" + let;
            output += "" + num;
      	}
      }
		System.out.println(output);
	}
}