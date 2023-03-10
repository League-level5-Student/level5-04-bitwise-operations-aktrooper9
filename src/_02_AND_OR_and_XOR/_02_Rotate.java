package _02_AND_OR_and_XOR;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/*
 * Goal: Implement left and right rotate methods.
 * 
 * Inherently Java doesn't have an instruction to perform left or right
 * rotates (though there are rotate functions in the Integer class).
 * 
 * A rotate is when a bit is shifted outside the width of the variable and is
 * placed on the other side. Here is an example of a right rotate on int 7
 * by 1:
 *      00000000 00000000 00000000 00000111   // original value of 7
 *      10000000 00000000 00000000 00000011   // rotate right by 1
 * 
 * Normally when the number 7 is right shifted by 1, the rightmost '1' is
 * discarded and the result looks like this:
 *      00000000 00000000 00000000 00000011   // 7 >> 1 (last '1' is discarded)
 * For a right rotate the number is not discarded and it's placed on the left,
 * the most significant bit (bit 31).
 * 
 * The same goes for a left rotate:
 *      11111111 11111111 11111111 11111000   // original value of -8
 *      11111111 11111111 11111111 11110001   // rotate left by 1
 */
public class _02_Rotate {
    int rotateLeft(int value, int rotateAmount) { 	
    	//int x= (value&1);
    	//if(x==1) {
    //		value = value<<1;
   // 		value = value|0b00000000000000000000000000000001;
   	
 //   	}
//    	else {
 //   		value = value<<1;
//    	}
    	return  value<<(rotateAmount)|value>>>32-rotateAmount;
    }
    
    int rotateRight(int value, int rotateAmount) {
//   
    	return value>>>rotateAmount|value<<(32-rotateAmount);
 
    }
    
    @Test
    void testRotateLeft() {
        int i = -8;

    //    String binaryStr = "";

  //      do {
            // 1. Logical right shift by 1
 //           int quotient = i >>> 1;

            // 2. Check remainder and add '1' or '0'
 //           if( i % 2 != 0 ){
//                binaryStr = '1' + binaryStr;
 //           } else {
 //               binaryStr = '0' + binaryStr;
  //          }
//
     //       i = quotient;
//
            // 3. Repeat until number is 0
      //  } while( i != 0 );


    

        int result = rotateLeft(i, 1);
        System.out.println("Left rotate tests");
        System.out.println("Expected: " + Integer.toBinaryString(-15));
        System.out.println("Actual  : " + Integer.toBinaryString(result));
        assertEquals(-15, result);
        
        result = rotateLeft(i, 3);
        System.out.println();
        System.out.println("Expected: " + Integer.toBinaryString(-57));
        System.out.println("Actual  : " + Integer.toBinaryString(result));
        assertEquals(-57, result);
    }
    
    @Test
    void testRotateRight() {
        int i = 7;
        
        int result = rotateRight(i, 1);
        System.out.println("\nRight rotate tests");
        System.out.println("Expected: " + Integer.toBinaryString(-2147483645));
        System.out.println("Actual  : " + Integer.toBinaryString(result));
        assertEquals(-2147483645, result);
        
        result = rotateRight(i, 16);
        System.out.println();
        System.out.println("Expected: " + Integer.toBinaryString(458752));
        System.out.println("Actual  : " + Integer.toBinaryString(result));
        assertEquals(458752, result);
    }
}
