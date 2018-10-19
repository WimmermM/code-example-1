import java.lang.reflect.Array;

public class AntiDiagonal {


    public static void main(String[] args) {
        int[][] myArray = new int[][]{{1, 2, 3}, {3, 4, 6}, {5, 2, 5}};
        System.out.println(getAntiDiagonalAvg(myArray));


    }


    public static int getAntiDiagonalAvg(int[][] myArray) {
        int number = 0;
        int counter = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (i == j) {

                    number += myArray[i][j];
                    counter++;

                }


            }

        }


        return number / counter;
    }


}
