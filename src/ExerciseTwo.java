public class ExerciseTwo {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("\nEvery element at an even index:");
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0) {
                System.out.print(number[i] + " ");
            }
        }
        //System.out.println();

        System.out.print("\nEvery even element:");
        for(int i = 0; i < 10; i++){
            if(number[i] % 2 == 0){
                System.out.print(number[i] + " ");
            }
        }
        //System.out.println();

        System.out.print("\nAll elements in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(number[i] + " ");
        }
        //System.out.println();


        System.out.print("\nThe first and last element:" + number[0] +" "+ number[9]);

    }
}
