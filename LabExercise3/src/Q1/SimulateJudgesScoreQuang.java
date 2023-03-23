package Q1;
import Lab3Q.MyMethod;
public class SimulateJudgesScoreQuang {
    public static void populateArray(double[] anyName){
        double random;
        for(int i=0; i<anyName.length;i++){
            random=(Math.random()*(10.0-7.0)+7.0); //random range: 7<=number<10
            anyName[i]=random;//assign random value to array position i.
        }
    }

    public static void displayArray(double[] anyName){
        System.out.print("[");//print out bracket
        for(int i=0; i<anyName.length;i++){
            System.out.printf("%.2f",anyName[i]);//print array variable at position i
            System.out.print(", ");//print comma to separate each variable
        }
        System.out.println("\b\b]");//delete space and comma for last variable and close bracket
    }

    public static double finalScore(double[] anyName) {
        double[] newArray = new double[anyName.length];//declare newArray
        System.arraycopy(anyName, 0, newArray, 0, anyName.length);//copy anyName array to newArray
        double max = newArray[0];
        int maxPos = 0;
        //assigning value to new variable

        for (int i = 1; i < anyName.length; i++) {
            if (newArray[i] > max) {
                max = newArray[i];
                maxPos = i;
            }
        }//find max value and assign its position to maxPos

        System.out.printf("\tHighest Score: %.2f\n", max);

        int minPos = 0;
        double min = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < min) {
                min = newArray[i];
                minPos = i;
            }
        }//find min value and assign its position to minPos

        System.out.printf("\tLowest Score: %.2f\n", min);//print lowest value
        System.out.println("Here are the scores after discarding the highest and the lowest scores: ");

        newArray[minPos] = 0;//swapping min value with 0
        newArray[maxPos] = 0;//swapping max value with 0
        displayArray(newArray); //display new array

        double average = newArray[0];
        for (int i= 0; i < newArray.length; i++){
            average += newArray[i];
            }
            return average/(newArray.length-2);
    }//find the average value of newArray

    public static void main(String[] args){
        MyMethod.myHeader(3,1,"Rank each contestant's score.");
        double[]contestantArray = new double[5]; //assign number of value inside contestantScore array.
        System.out.println("Here are the scores from 5 Judges:"); //prompt display for the score
        populateArray(contestantArray);//randomly populate contestantArray
        displayArray(contestantArray);//display values inside contestantArray
        System.out.printf("\tThe final score: %.2f\n\n", finalScore(contestantArray));
        //print final contestantArray removing highest and lowest score as well as the average
        MyMethod.myFooter(1); //sign off message for question 1
    }
}
