import java.io.*;
import java.util.*;

public class rovarspraket {
	static String plaintext;
	static String translated;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		plaintext = input.nextLine();
		
      String vowels = "AEIOUaeiou ";
      translated = "";
      
      for (int i = 0; i < plaintext.length(); i++) {
         translated += "" + plaintext.charAt(i);
         
         if (!(vowels.indexOf(plaintext.charAt(i)) >= 0)) {
            translated += "" + "o" + plaintext.charAt(i);
         }
      }
		
		System.out.println(translated);
	}
}