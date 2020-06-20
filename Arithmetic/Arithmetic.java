import javax.swing.*;

public class Arithmetic {
   static final int USER_INPUT = 1;
   static final int GENERATED = 2;
   
   // 1st Number
   static Number num1;
   /*static boolean[] boolArr = new boolean[8];*/
   
   // 2nd Number
   static Number num2;
   /*static boolean[] boolArr2 = new boolean[8];*/
   
   // Addition Result
   static Number addResult;
   
   // Subtraction Result
   static Number subResult;
   
   public static void main(String[] args) {
      char menu = JOptionPane.showInputDialog(
         "A. Add 2 entered 8-bit Binary numbers"
         + "\nB. Subtract 2 entered 8-bit Binary numbers"
         + "\nC. Add 2 generated 8-bit Binary numbers"
         + "\nD. Subtract 2 generated 8-bit Binary numbers"
         + "\nT. Test"
         + "\nX. Exit"
      ).toUpperCase().trim().charAt(0);
      
      switch (menu) {
         case 'A':
            initNums(USER_INPUT);
            ByteRippleCarryAdder(num1.getBinaryArr(), num2.getBinaryArr());
            display(num1, num2, addResult, "+");
            break;
            
         case 'B':
            initNums(USER_INPUT);
            ByteRippleBorrowSubtractor(num1.getBinaryArr(), num2.getBinaryArr());
            display(num1, num2, subResult, "-");
            break;
            
         case 'C':
            initNums(GENERATED);
            ByteRippleCarryAdder(num1.getBinaryArr(), num2.getBinaryArr());
            display(num1, num2, addResult, "+");            
            break;
            
         case 'D':
            initNums(GENERATED);
            ByteRippleBorrowSubtractor(num1.getBinaryArr(), num2.getBinaryArr());
            display(num1, num2, subResult, "-");
            break;
            
         case 'T':
            testMethods();
         break;
            
         default:
            System.exit(0);
      }
   }
   
   public static void testMethods() {
      // Method Testing
      
      System.out.println( 
         AND(true, true) 
      );
      
      System.out.println( 
         OR(true, false) 
      );
      
      System.out.println( 
         NOT(false) 
      );
      
      System.out.println( 
         XOR(true, false) 
      );
      
      System.out.println(
         HalfAdder(false, false)
      );
      
      System.out.println(
         FullAdder(true, false, false)
      );
      
      System.out.println(
         HalfSubtractor(true, true)
      );
      
      System.out.println(
         FullSubtractor(false, true, false)
      );
      
      System.out.println( 
         isZero("00000001") 
      );
      
      // Testing Number Class
      Number n = new Number("00000010");
      System.out.println(n.getNum());
      System.out.println(n.getBinStr());
      boolean[] bArr = n.getBinaryArr();
      
      for (int i = 0; i < 8; i++) {
         System.out.print(bArr[i] + " ");
      }

   }
   
   //Initialise Numbers
   public static void initNums(int c) throws NumberFormatException {
      if (c == USER_INPUT) {
         String n = JOptionPane.showInputDialog("Enter an 8-bit or less binary number");
         num1 = new Number(n);         
         //System.arraycopy(num1.getBinaryArr(), 0, boolArr, 0, 8);
         
         String n2 = JOptionPane.showInputDialog("Enter another 8-bit or less binary number");
         num2 = new Number(n2);
         //System.arraycopy(num2.getBinaryArr(), 0, boolArr2, 0, 8);

         
      } else if (c == GENERATED) {
         String binaryNum = "";
         for (int i = 0; i < 8; i++) {
            binaryNum += "" + (int)(Math.round(Math.random()));
         }
         num1 = new Number(binaryNum);
         
         binaryNum = "";
         for (int i = 0; i < 8; i++) {
            binaryNum += "" + (int)(Math.round(Math.random()));
         }
         num2 = new Number(binaryNum);
      }
   }
   
   // Converts a Binary "1" or "0" to a boolean value
   public static boolean BinaryCharToBool(String digit) {
      boolean flag = false;
      int n = Integer.parseInt(digit);
      
      if (n==1) {
         flag = true;
      }
      
      return flag;
   }

   
   /*********************************/ 
   // Display Methods
   /*********************************/
   
   // Displays the binary numbers in proper binary order with operation proper formatting
   public static void display(Number n1, Number n2, Number r, String o) {
      System.out.println("  " + n1.getBinStr());
      System.out.println(o + " " + n2.getBinStr());
      System.out.println("= " + r.getBinStr());
      
      System.out.println("\n" + n1.getNum());
      System.out.println(n2.getNum());
      System.out.println(r.getNum() + "\n\n");
      
   }
   
   /*********************************/ 
   // Logic Gates
   /*********************************/
   
   // AND Gate
   public static boolean AND(boolean input1, boolean input2) {
      boolean flag = false;
      
      if (input1 == input2) {
         if (input1 == true) {
            flag = true;
         }
      }
      
      return flag;
   }
   
   // OR Gate
   public static boolean OR(boolean input1, boolean input2) {
      boolean flag = false;
      
      if (input1 == true) {
         flag = true;
      }
      
      if (input2 == true) {
         flag = true;
      }
      
      return flag;
   }
   
   // NOT Gate
   public static boolean NOT(boolean input) {
      boolean flag = false;
      
      if (input == false) {
         flag = true;
      }
      
      return flag;
   }
   
   // XOR Gate (Exclusive OR)
   public static boolean XOR(boolean input1, boolean input2) {
      boolean flag = false;
      
      if ( AND(OR(input1, input2), NOT(AND(input1, input2))) ) {
         flag = true;
      }
      
      return flag;
   }
   
   /*********************************/ 
   // Adders
   /*********************************/
   
   public static String HalfAdder(boolean input1, boolean input2) {
      boolean SUM = XOR(input1, input2);
      boolean CARRY = AND(input1, input2);
      
      return SUM + " " + CARRY;
   }
   
   public static String FullAdder(boolean input1, boolean input2, boolean input3) {
      String[] halfResult1 = HalfAdder(input1, input2).split(" ");
      boolean SUM1 = Boolean.parseBoolean(halfResult1[0]);
      boolean CARRY1 = Boolean.parseBoolean(halfResult1[1]);
      
      String[] halfResult2 = HalfAdder(SUM1, input3).split(" ");
      boolean SUM2 = Boolean.parseBoolean(halfResult2[0]);
      boolean CARRY2 = Boolean.parseBoolean(halfResult2[1]);
      
      boolean CARRY = OR(CARRY1, CARRY2);
      boolean SUM = SUM2;
      
      return SUM + " " + CARRY;
   }
   
   public static void ByteRippleCarryAdder(boolean[] binaryNum, boolean[] binaryNum2) {
      boolean[] binaryResult = new boolean[8];
      
      String[] halfResult0 = HalfAdder(binaryNum[0], binaryNum2[0]).split(" ");
      binaryResult[0] = Boolean.parseBoolean(halfResult0[0]);
      boolean CARRY0 = Boolean.parseBoolean(halfResult0[1]);
      
      String[] fullResult1 = FullAdder(CARRY0, binaryNum[1], binaryNum2[1]).split(" ");
      binaryResult[1] = Boolean.parseBoolean(fullResult1[0]);
      boolean CARRY1 = Boolean.parseBoolean(fullResult1[1]);
      
      String[] fullResult2 = FullAdder(CARRY1, binaryNum[2], binaryNum2[2]).split(" ");
      binaryResult[2] = Boolean.parseBoolean(fullResult2[0]);
      boolean CARRY2 = Boolean.parseBoolean(fullResult2[1]);
      
      String[] fullResult3 = FullAdder(CARRY2, binaryNum[3], binaryNum2[3]).split(" ");
      binaryResult[3] = Boolean.parseBoolean(fullResult3[0]);
      boolean CARRY3 = Boolean.parseBoolean(fullResult3[1]);
      
      String[] fullResult4 = FullAdder(CARRY3, binaryNum[4], binaryNum2[4]).split(" ");
      binaryResult[4] = Boolean.parseBoolean(fullResult4[0]);
      boolean CARRY4 = Boolean.parseBoolean(fullResult4[1]);
      
      String[] fullResult5 = FullAdder(CARRY4, binaryNum[5], binaryNum2[5]).split(" ");
      binaryResult[5] = Boolean.parseBoolean(fullResult5[0]);
      boolean CARRY5 = Boolean.parseBoolean(fullResult5[1]);
      
      String[] fullResult6 = FullAdder(CARRY5, binaryNum[6], binaryNum2[6]).split(" ");
      binaryResult[6] = Boolean.parseBoolean(fullResult6[0]);
      boolean CARRY6 = Boolean.parseBoolean(fullResult6[1]);
      
      String[] fullResult7 = FullAdder(CARRY6, binaryNum[7], binaryNum2[7]).split(" ");
      binaryResult[7] = Boolean.parseBoolean(fullResult7[0]);
      boolean CARRY7 = Boolean.parseBoolean(fullResult7[1]);
      
      System.out.println("Carry Overflow: " + CARRY7);

      String binResult = "";      
      for (int i = 7; i >=0; i--) {
         if (binaryResult[i]) {
            binResult += 1;
         } else {
            binResult += 0;
         }
      }
      addResult = new Number(binResult, CARRY7);
   }
   
   /*********************************/ 
   // Subtractors
   /*********************************/
   
   public static String HalfSubtractor(boolean input1, boolean input2) {
      boolean DIFFERENCE = XOR(input1, input2);
      boolean BORROW = AND(NOT(input1), input2);
      
      return DIFFERENCE + " " + BORROW;
   }
   
   public static String FullSubtractor(boolean input1, boolean input2, boolean BORROW_IN) {
      String[] halfResult1 = HalfSubtractor(input1, input2).split(" ");      
      boolean DIFFERENCE1 = Boolean.parseBoolean(halfResult1[0]);
      boolean BORROW1 = Boolean.parseBoolean(halfResult1[1]);
      
      boolean DIFFERENCE2 = XOR(DIFFERENCE1, BORROW_IN);
      boolean BORROW2 = AND(NOT(DIFFERENCE1), BORROW_IN);
            
      boolean BORROW_OUT = OR(BORROW1, BORROW2);
      boolean DIFFERENCE = DIFFERENCE2;
      
      return DIFFERENCE + " " + BORROW_OUT;
   }
   
   public static void ByteRippleBorrowSubtractor(boolean[] binaryNum, boolean[] binaryNum2) {
      boolean[] binaryResult = new boolean[8];
      
      String[] halfResult0 = HalfSubtractor(binaryNum[0], binaryNum2[0]).split(" ");
      binaryResult[0] = Boolean.parseBoolean(halfResult0[0]);
      boolean BORROW0 = Boolean.parseBoolean(halfResult0[1]);
      
      String[] fullResult1 = FullSubtractor(binaryNum[1], binaryNum2[1], BORROW0).split(" ");
      binaryResult[1] = Boolean.parseBoolean(fullResult1[0]);
      boolean BORROW1 = Boolean.parseBoolean(fullResult1[1]);
      
      String[] fullResult2 = FullSubtractor(binaryNum[2], binaryNum2[2], BORROW1).split(" ");
      binaryResult[2] = Boolean.parseBoolean(fullResult2[0]);
      boolean BORROW2 = Boolean.parseBoolean(fullResult2[1]);
      
      String[] fullResult3 = FullSubtractor(binaryNum[3], binaryNum2[3], BORROW2).split(" ");
      binaryResult[3] = Boolean.parseBoolean(fullResult3[0]);
      boolean BORROW3 = Boolean.parseBoolean(fullResult3[1]);
      
      String[] fullResult4 = FullSubtractor(binaryNum[4], binaryNum2[4], BORROW3).split(" ");
      binaryResult[4] = Boolean.parseBoolean(fullResult4[0]);
      boolean BORROW4 = Boolean.parseBoolean(fullResult4[1]);
      
      String[] fullResult5 = FullSubtractor(binaryNum[5], binaryNum2[5], BORROW4).split(" ");
      binaryResult[5] = Boolean.parseBoolean(fullResult5[0]);
      boolean BORROW5 = Boolean.parseBoolean(fullResult5[1]);
      
      String[] fullResult6 = FullSubtractor(binaryNum[6], binaryNum2[6], BORROW5).split(" ");
      binaryResult[6] = Boolean.parseBoolean(fullResult6[0]);
      boolean BORROW6 = Boolean.parseBoolean(fullResult6[1]);
      
      String[] fullResult7 = FullSubtractor(binaryNum[7], binaryNum2[7], BORROW6).split(" ");
      binaryResult[7] = Boolean.parseBoolean(fullResult7[0]);
      boolean BORROW7 = Boolean.parseBoolean(fullResult7[1]);
      
      System.out.println("Borrow Overflow: " + BORROW7);

      String binResult = "";      
      for (int i = 7; i >=0; i--) {
         if (binaryResult[i]) {
            binResult += 1;
         } else {
            binResult += 0;
         }
      }
      subResult = new Number(binResult, BORROW7);
   }
   
   /*********************************/ 
   // Flags
   /*********************************/
   
   // Checks if a value is zero using logic gates
   public static boolean isZero(String binaryStr) {
      boolean flag = false;
      boolean[] Arr = new boolean[8];
      
      for (int i = 0; i < 8; i++) {
         Arr[i] = BinaryCharToBool("" + binaryStr.charAt(i));
      }
      
      flag = NOT(
         OR( 
            OR(
               OR(Arr[0], Arr[1]), 
               OR(Arr[2], Arr[3])
            ), 
            OR(
               OR(Arr[4], Arr[5]), 
               OR(Arr[6], Arr[7])
            ) 
         )
      );
      
      return flag;
   }
}