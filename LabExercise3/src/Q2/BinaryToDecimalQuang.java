package Q2;
import Lab3Q.MyMethod;
public class BinaryToDecimalQuang {
    private int[] binaryArray;
    public BinaryToDecimalQuang(){ //default constructor value
    }
    public BinaryToDecimalQuang(int[] myArray){
        binaryArray = myArray; //assign constructor variable to binaryArray

    }
    public void displayArray(){
        System.out.print("[");
        for(int i=0; i<binaryArray.length;i++) {
            System.out.printf("%d ", binaryArray[i]);//print array variable at position i
        }
        System.out.print("\b]");
        //display array seperated by comma.
    }

    public int getDecimalValue(){
        int count = 0;
        int decimalValueSum = 0;
        for(int i=binaryArray.length-1;i>=0;i--) {
            double decimalValue = binaryArray[i] * MyMethod.myPow(2, count);
            count++;
            decimalValueSum += decimalValue;
        }
        return decimalValueSum; //return decimal value (binary number)*2^(rightward position)
    }

    public void doubleTheSizeZeroPadding(){
        int[] doubleArray= new int[binaryArray.length*2];
        System.arraycopy(binaryArray,0,doubleArray,4,binaryArray.length);
        binaryArray = doubleArray;
        //double the number of spaces available and fill empty spaces with 0
    }
    public int[] reverseArray(){
        int [] reverse = new int[binaryArray.length];
        for(int i=0, j=binaryArray.length-1; i<binaryArray.length; i++, j--)
            reverse[i]=binaryArray[j];
        binaryArray = reverse;
        return binaryArray;
        //reverse the position of values inside the array
    }
    public void shiftRight(){
        int shiftR = binaryArray[binaryArray.length-1];
        for(int i = binaryArray.length-1; i>0; i--)
            binaryArray[i]= binaryArray[i-1];
        binaryArray[0]=shiftR;
        //shift each value one position to the right
    }
    public void shuffleArray(){
        int temp = 0;
        int j = (int)(Math.random()*binaryArray.length);
        for(int i=0; i<binaryArray.length;i++) {
            temp = binaryArray[i];
            binaryArray[i] = binaryArray[j];
            binaryArray[j] = temp;
            //randomly move the values inside the array to another position (shuffling its value)
        }
    }
}

