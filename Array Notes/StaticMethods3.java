public class StaticMethods3 {
   static int numArr[] = new int[5];
   static int len = numArr.length;
   
   public static void main (String[] args) {
      getNumbers();
      display();
      System.out.println(average());
      System.out.println(numEven());
   }
   
   public static void getNumbers() {
      for (int i = 0; i < len; i++) {
         numArr[i] = (int)(Math.random()*(50)+1);
      }
   }
   
   public static void display() {
      for (int i = 0; i < len; i++) {
         System.out.println(numArr[i]);
      }
   }
   
   public static double average() {
      int sum = 0;
      double avg;
      
      for (int i = 0; i < len; i++) {
         sum += numArr[i];
      }
      
      avg = sum/(double)len;
      
      return avg;
   }
   
   public static int numEven() {
      int count = 0;
      
      for (int i = 0; i < len; i++) {
         if (numArr[i] % 2 == 0) {
            count++;
         }
      }
      
      return count;
   }
}