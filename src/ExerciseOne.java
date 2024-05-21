import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            number[i] = input.nextInt();
        }

        System.out.println("Numbers in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(number[i]);
        }
    }
}
