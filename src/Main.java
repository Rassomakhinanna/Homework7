import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила" + sum + "рублей");

        //Задание 2
        int maxExpense = -1;
        int[] expense = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117};
        for (int i = 0; i < expense.length; i++) {
            final int current = expense[i];
            if (current > maxExpense) {
                maxExpense = current;
            }
        }
        System.out.println("Максимальная сумма затрат за день составила " + maxExpense + " рублей");

        int min = 10_000_000;
        for (int i = 0; i < expense.length; i++) {
            if (min>expense [i]) {
                min = expense[i];
            }
        }
        System.out.println(" Минимальная сумма затрат за день " + min + " рублей ");

        // Задание 3
        double medium = (double)  sum/ arr.length;
        System.out.println(medium);

        // Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int j = reverseFullName.length - 1; j >=0; j--) {
            System.out.print(reverseFullName[j]);
        }
    }
}