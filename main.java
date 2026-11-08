package Assngment;

public class main {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int[] result = solution.reverseArray(numbers);

        System.out.print("Reverse Array: ");

        for (int num : result) {
            System.out.print(num + " ");
        }

        System.out.println();

        int[] bonus = solution.reverseFirstK(numbers, 3);

        System.out.print("Bonus K=3: ");

        for (int num : bonus) {
            System.out.print(num + " ");
        }
    }
}