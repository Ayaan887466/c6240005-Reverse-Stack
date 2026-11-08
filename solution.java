package Assngment;

public class solution {

        public static int[] reverseArray(int[] numbers) {
            ArrayStack stack = new ArrayStack(2);

            for (int num : numbers) {
                stack.push(num);
            }

            int[] result = new int[numbers.length];
            int i = 0;

            while (!stack.isEmpty()) {
                result[i++] = stack.pop();
            }

            return result;
        }

        public static int[] reverseFirstK(int[] numbers, int k) {
            ArrayStack stack = new ArrayStack(2);
            int[] result = new int[numbers.length];

            for (int i = 0; i < k; i++) {
                stack.push(numbers[i]);
            }

            int i = 0;

            while (!stack.isEmpty()) {
                result[i++] = stack.pop();
            }

            for (int j = k; j < numbers.length; j++) {
                result[j] = numbers[j];
            }

            return result;
        }
    }

