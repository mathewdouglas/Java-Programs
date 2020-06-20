public class Number {
   private String binStr;
   private boolean[] binaryArr;
   private int num;
   private boolean overflow = false;
   
   public Number(String binStr) {
      this.binStr = binStr;
      this.binaryArr = toBinary(binStr);
      this.num = BinaryToInt(binaryArr, this.overflow);
   }
   
   public Number(String binStr, boolean overflow) {
      this.binStr = binStr;
      this.binaryArr = toBinary(binStr);
      this.num = BinaryToInt(binaryArr, overflow);
   }
   
   /*********************************/ 
   // Convertions
   /*********************************/
   
   // Converts String to Binary
   public static boolean[] toBinary(String b) {
      boolean Arr[] = new boolean[8];     
      int len = b.length();
      int index = b.length()-1;
      int j = 0;
      
      if (len > 8) {
         index = 7;
      }
      for (int i = index; i >= 0; i--) {
         Arr[j++] = BinaryCharToBool("" + b.charAt(i));
      }
      
      return Arr;
   }
   
   // Converts 8bit Binary to int
   public static int BinaryToInt(boolean[] binArr, boolean overflow) {
      int n = 0;
      int j = 0;
      int i = 0;
      for (i = 0; i < 8; i++) {
         if (binArr[i]) {
            n += Math.pow(2, i);
         }
      }
      
      if (overflow) {
         n += Math.pow(2, i);
      }
      
      return n;
   }
   
   // Converts String 1 or 0 to bool true or false
   public static boolean BinaryCharToBool(String digit) {
      boolean flag = false;
      int n = Integer.parseInt(digit);
      
      if (n==1) {
         flag = true;
      }
      
      return flag;
   }
   
   // Converts int 1 or 0 to bool true or false
   public static boolean BinaryCharToBool(int n) {
      boolean flag = false;
      
      if (n==1) {
         flag = true;
      }
      
      return flag;
   }
   
   /*********************************/ 
   // Accessor Methods
   /*********************************/
   
   public String getBinStr() {
      return binStr;
   }
   
   public int getNum() {
      return num;
   }
   
   public boolean[] getBinaryArr() {
      return binaryArr;
   }
   
   public boolean getOverflow() {
      return overflow;
   }
   
   public String toString() {
      String out = "Binary: ";
      for (int i = 7; i >= 0; i--) {
         if (binaryArr[i]) {
            out += "1";
         } else {
            out += "0";
         }
      }
      out += "\n Decimal: " + num + "\n";
      //out += binStr;
      
      return out;
   }
}