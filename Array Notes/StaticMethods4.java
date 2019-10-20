public class StaticMethods4 {
   static String nameArr[] = {"Bususiwe", "Valenchia", "Bob", "Andrew", "Katie"};
   static int len = 5;
   
   public static void main (String[] args) {
      display();
      lessSevLet();
      shortName();

   }
   
   public static void display() {
      for (int i = 0; i < len; i++) {
         System.out.println(nameArr[i]);
      }
   }
   
   public static void lessSevLet() {
      for (int i = 0; i < len; i++) {
         if (nameArr[i].length() < 7) {
            System.out.println(nameArr[i]);
         }
      }
   }
   
   public static void shortName() {
      String shortN = nameArr[0];
      
      for (int i = 1; i < len; i++) { 
         if (nameArr[i].length() < shortN.length()) {
            shortN = nameArr[i];
         }
      }
      
      System.out.println(shortN);
   }
}