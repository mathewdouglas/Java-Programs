public class Question1 {
   static int numArr[] = new int[20];
   static int evenArr[] = new int[20];
   static int oddArr[] = new int[20];
   static int evenCnt, oddCnt = 0;
   
   public static void main (String[] args) { 
      Input();
      EvenOdd();
      System.out.println("");
      System.out.print("All the numbers are : ");
      Display(numArr, 20);
      System.out.println("");
      System.out.print("All the even numbers are : ");
      Display(evenArr, evenCnt);
      System.out.println("");
      System.out.print("All the odd numbers are : ");
      Display(oddArr, oddCnt);
      System.out.println("");
      System.out.println("There are " + Mult3(oddArr, oddCnt) + " multiples of 3 in the odd array");
   }

   public static void Input(){
      for (int i = 0; i < 20; i++) {
         numArr[i] = (int)(Math.random()*(60-10+1)+10);
      }
   }
   
   public static void EvenOdd() {
      evenCnt = 0;
      oddCnt = 0;
      
      for (int i = 0; i < 20; i++) {
         if (numArr[i] % 2 == 0) {
            evenArr[evenCnt] = numArr[i];
            evenCnt++;
         }else{
            oddArr[oddCnt] = numArr[i];
            oddCnt++;
         }
      }
   }
   
   public static void Display(int tempArr[], int size) {
      for (int i = 0; i < size; i++) {
         System.out.print(tempArr[i] + "; ");
      }
   }
   
   public static int Mult3(int tempArr[], int size) {
      int cnt = 0;
      
      for (int i = 0; i <= size; i++) {
         if (tempArr[i] % 3 == 0) {
            cnt++;
         }
      }
      
      return cnt;
   }
}