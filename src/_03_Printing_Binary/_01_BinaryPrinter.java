package _03_Printing_Binary;

public class _01_BinaryPrinter {
    /*
     * Complete the methods below so they print the passed in parameter in binary.
     * Do not use the Integer.toBinaryString method!
     * Use the main method to test your methods.
     */


    public void printByteBinary(byte b) {
        // We first want to print the bit in the one's place
    	String binary="";
    	for(int y=7 ;y>=0;y-=1) {
  int x = b>>>y;
  x=x&1;
        // Shift b seven bits to the right
    binary=binary+x;
    	}
        // Use the & operator to "mask" the bit in the one's place
        // This can be done by "anding" (&) it with the value of 1

        // Print the result using System.out.print (NOT System.out.println)

        //Use this method to print the remaining 7 bits of b
    System.out.println(binary);
    }

    public void printShortBinary(short s) {
        // Create 2 byte variables
    	
byte b=(byte)(s&255);
byte by=(byte)((s>>8)&255);
printByteBinary(by);
printByteBinary(b);
        // Use bit shifting and masking (&) to save the first
        // 8 bits of s in one byte, and the second 8 bits of
        // s in the other byte


        // Call printByteBinary twice using the two bytes
        // Make sure they are in the correct order
    }

    public void printIntBinary(int i) {
        // Create 2 short variables
    	short b=(byte)(i&65535);
    	short by=(byte)((i>>16)&65535);
    	printShortBinary(by);
    	printShortBinary(b);
        // Use bit shifting and masking (&) to save the first
        // 16 bits of i in one short, and the second 16 bits of
        // i in the other short

        // Call printShortBinary twice using the two short variables
        // Make sure they are in the correct order
    }

    public void printLongBinary(long l) {
        // Use the same method as before to complete this method
    	
    }

    public static void main(String[] args) {
        // Test your methods here
    	byte bite= 64;
    	 _01_BinaryPrinter print = new _01_BinaryPrinter(); 
    	print.printByteBinary(bite);
    	print.printShortBinary(bite);
    	print.printIntBinary(bite);
    }
}
