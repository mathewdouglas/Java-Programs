import javax.swing.*;
import java.io.*;
import java.util.*;

public class TextFilesAndArrays {
   static Scanner scFile;
   static String temp[] = new String[10];
   static String passengers[] = new String[13];
   static String mango[] = new String[13];
   static int len = 10;
   
   public static void main(String[] args) throws IOException {
      ReadInfo();
      Display(len);
      Append();
      Sort();
      Display(12);
   }
   
   public static void ReadInfo() throws IOException {
      Scanner scFile = new Scanner(new File("passengers.txt"));
      int i = 0;
      String line = "";
      
      while (scFile.hasNext()) {
         line = scFile.nextLine();
         passengers[i] = Convert(line);;
         i++;
      }
      scFile.close();
   }
   
   public static String Convert(String line) {
      Scanner scLine = new Scanner(line).useDelimiter("#");
      String name = scLine.next();
      String surname = scLine.next();
      String idNum = scLine.next();
      String fliNum = scLine.next();
      
      char init = name.toUpperCase().charAt(0);
      String gender = "";
      
      if (("" + idNum.charAt(8)).equals("2")) {
         gender = "female";
      } else {
         if (("" + idNum.charAt(8)).equals("3")) {
            gender = "male";
         }
      }
      
      String airlineInit = "" + fliNum.charAt(0) + fliNum.charAt(1);
      String airline = "";
      
      switch (airlineInit) {
         case "MN": {
            airline = "Kulula";
         } break;
         case "JE": {
            airline = "Mango";
         } break;
         case "BA": {
            airline = "Britsh Airways";
         } break;
         case "SA": {
            airline = "South African Airways";
         } break;
         case "T1": {
            airline = "1 Time";
         } break;
      }
      
      String out = "" + init + "." + surname + "," + gender + " " + airline;
      return out;
   }
   
   public static void Display(int size) {
      for (int i = 0; i < size; i++) {
         System.out.println("" + (i+1) +  ". " + passengers[i]);
      }
      System.out.println();
   }
   
   public static void Append() throws IOException {  
      PrintWriter outFile = new PrintWriter (new FileWriter ("passengers.txt", true));
      String info = ""; 
      
      for (int i = 9; i < 12; i++) {
         info = JOptionPane.showInputDialog("Enter the passenger info (name#surname#id number#flight number)");
         outFile.println(info);
         passengers[i] = Convert(info);;
      }     
      outFile.close();
      len = 13;
   }
   
   public static void Sort() {
      int pos;
      String temp;
      
      for (int i = 0; i < 11; i++) {
         pos = i;
         
         for (int j = i+1; j < 12; j++) {
            if (passengers[pos].substring(2, passengers[pos].indexOf(",")).compareTo(passengers[j].substring(2, passengers[j].indexOf(",")))>0) {
               pos = j;
            }
         }
         
         temp = passengers[i];
         passengers[i] = passengers[pos];
         passengers[pos] = temp;
      }
   }
   
   public static void Delete() {
      int k = 0;
      
      for (int i = 0; i < len; i++) {
         if (passengers[i].substring(passengers[i].indexOf(" ")+1).equals("Mango")) {
            mango[k] = passengers[i];
            k++;
            
            for (int l = i; l < len; l++) {
               passengers[l] = passengers[l+1];
            }
            len--;
         }
      }
   }
}