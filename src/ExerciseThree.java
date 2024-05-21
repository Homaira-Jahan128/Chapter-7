import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        final int LENGTH = 100;
        double[] values = new double[LENGTH];
        int currentSize = 0;

        System.out.println("Enter values, Q to quit");
        Scanner input = new Scanner(System.in);
        while(input.hasNextDouble() && currentSize < values.length){
            values[currentSize] = input.nextDouble();
            currentSize++;
        }

        double largest = values[0];
        double smallest = values[0];
        for(int i = 0; i < currentSize; i++){
            if (values[i] > largest){
                largest = values[i];
            }
            if (values[i] < smallest){
                smallest = values[i];
            }
        }

        for(int i = 0;i < currentSize;i++){
            System.out.print(values[i]);
            if(values[i] == largest){
                System.out.print(" <== largest value");
            }
            if(values[i] == smallest){
                System.out.print(" <== smallest value");
            }
            System.out.println();
        }
    }
}
