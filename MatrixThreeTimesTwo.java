package GeneralReviewQuestionsSectionTwo;

import java.util.Arrays;

public class MatrixThreeTimesTwo {
    public static void main(String[]args){
        int array[][] = new int[2][3];
        int totalArray = 0;


        for (int index = 0;index<array.length;index++){
            for (int index2 = 0;index2<array[index].length;index2++){
                array[index][index2] = (int)(Math.random() *10);

                totalArray += array[index][index2];

            }
        }
        for (int i = 0; i < 2; i++) {
            Arrays.sort(array[i]);
        }

        int theBiggestNumber = array[1][2];
        int theMostLittleNumber =array[0][0];
        System.out.println("total : "+totalArray);
        System.out.println("the most little number : "+theMostLittleNumber);
        System.out.println("the biggest number : "+theBiggestNumber);

    }
}
