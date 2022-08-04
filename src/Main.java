import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        int min = 1000000;
        int max = -1;
        float average = 0.00f;
        for (int element : arr) {
           // Задание 1
            sum += element;
            // Задание 2
            if (min > element) {
                min = element;
            }
            if (max < element) {
                max = element;
            }
        }
        // Задание 3
        average = sum / 30;
        average = average + (1 - average % 1);
        System.out.println(sum);
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println(average);

        // Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}