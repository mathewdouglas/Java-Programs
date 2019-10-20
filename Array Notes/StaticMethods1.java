public class StaticMethods1 {
   static int numArr[] = new int[10];
   static 
   
   public static void main (String[] args) {
      getNumbers();
      display();
   }
   
   public static void getNumbers() {
      for (int i = 0; i < len; i++) {
         numArr[i] = (int)(Math.random()*(50+1));
      }
   }
   
   public static void display() {
      for (int i = 0; i < len; i++) {
         System.out.println(numArr[i]);
      }
   }
}