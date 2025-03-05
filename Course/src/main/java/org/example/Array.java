package org.example;

public class Array {
    public static void main(String[] args) {


//        int nums[] = new int[4];
//        nums[0] = 1;
//        nums[1] = 2;
//        nums[2] = 3;
//        nums[3] = 4;
//
//        for(int i = 0; i < nums.length; i++){
//            System.out.println(nums[i]);
//       }

//        char alphabets[] = new char[4];
//        alphabets[0] = 'A';
//        alphabets[1] = 'B';
//        alphabets[2] = 'C';
//        alphabets[3] = 'D';
//        for (char i = 0; i < alphabets.length; i++){
//            System.out.println(alphabets[i]);
//        }

        //Multidimesional Array

//        int nums[][] = new int[4][5];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++) {
//                nums[i][j] = (int) (Math.random() * 10);
//                System.out.print(nums[i][j] + "  ");
//            }
//            System.out.println();
//        }


    //jagged and 3D array

//        int numbers[][] = new int[3][];
//        numbers[0] = new int[3];
//        numbers[1] = new int[5];
//        numbers[2] = new int[4];
//
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                numbers[i][j] = (int) (Math.random() * 10);
//                System.out.print(numbers[i][j] + "  ");
//            }
//            System.out.println(" ");
//        }

        int numbers[][][] = new int[3][4][5];
//        numbers[0] = new int[3];
//        numbers[1] = new int[5];
//        numbers[2] = new int[4];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                for (int k = 0; k < numbers[i][j].length; k++) {
                    numbers[i][j][k] = (int) (Math.random() * 10);
                    System.out.print(numbers[i][j][k] + "  ");
            }
            System.out.println(" ");
            }
            System.out.println(" ");
        }

    }
    protected void test() {

    }
}




