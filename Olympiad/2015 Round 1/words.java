import java.io.*;
import java.util.*;

public class words {
	static String word;
	static boolean ordered;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		word = input.nextLine();
		ordered = true;
      
      for (int i = 0; i < (word.length()-1); i++) { 
         if (("" + word.charAt(i)).compareTo("" + word.charAt(i+1)) > 0) {
            ordered = false;
         }
      }
		
		System.out.println(ordered ? "True" : "False");
	}
}