package Q2;
import Lab3Q.MyMethod;
public class DemoBinaryToDecimal {
    public static void main(String[] args){
        MyMethod.myHeader(3,2,"Program manipulate binary input.");
        int [] nArray = new int[4];
        for(int i=0; i<nArray.length;i++){
            int randInt = (int)(Math.random()*(2));
            nArray[i] = randInt;
        }
        BinaryToDecimalQuang array1 = new BinaryToDecimalQuang(nArray);
        // Declare BinaryToDecimalQuang new reference variable array 1.
        System.out.print("\nThe 4 bit number: ");
        array1.displayArray();
        //display initial randomized 4 space binary array
        System.out.printf("\nThe corresponding decimal value is: %d\n", array1.getDecimalValue());
        //calculate decimal value of array above
        array1.doubleTheSizeZeroPadding();
        //double the space available inside array
        System.out.print("The 8 bit number, after the size is doubled and zero padded: ");
        array1.displayArray();
        //display initial array with additional spaces, total 8
        System.out.printf("\nThe corresponding decimal value is: %d\n", array1.getDecimalValue());
        //calculate decimal value of array above
        array1.reverseArray();
        //reverse position of values inside array
        System.out.print("The 8 bit number after reversing the array: ");
        array1.displayArray();
        //display reversed array
        System.out.printf("\nThe corresponding decimal value is: %d\n", array1.getDecimalValue());
        //calculate decimal value of array above
        array1.shiftRight();
        //shift value in above array one space to the right
        System.out.print("The 8 bit number after the shift right operation: ");
        array1.displayArray();
        //display reverse array
        System.out.printf("\nThe corresponding decimal value is: %d\n", array1.getDecimalValue());
        //calculate decimal value of array above
        array1.shuffleArray();
        //shuffle position of above array
        System.out.print("The 8 bit number after the shuffling operation: ");
        array1.displayArray();
        //display shuffled array
        System.out.printf("\nThe corresponding decimal value is: %d\n\n", array1.getDecimalValue());
        //calculate decimal value of array above
        MyMethod.myFooter(2);
        //sign off message for question 2
    }
}
