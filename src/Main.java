import java.util.Scanner;
public class Main {

    //public static int[] values
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("How many values are in dataset?");

        //Set the # to the array
        int[] numbers = new int[s1.nextInt()];

        System.out.println("Enter the " + numbers.length +" numeric data values");

        //Store the value in numbers array
        for ( int i = 0; i < numbers.length; i++){

            numbers[i] = s1.nextInt() ;
        }
        //display
        String star = "*";

        System.out.println("Index\tValue\tHistogram");
        for(int j = 0;  j < numbers.length; j++){
            System.out.println(j + "\t\t" + numbers[j] + "\t\t" + star.repeat(numbers[j]));

        }



    }
}