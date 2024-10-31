import java.util.Scanner;

public class SmallestOddElement {

    // Підпрограма для пошуку індексу найменшого непарного елемента
    public static int findSmallestOddIndex(int[] array) {
        int minOdd = Integer.MAX_VALUE;
        int minOddIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] < minOdd) {
                minOdd = array[i];
                minOddIndex = i;
            }
        }

        return minOddIndex; // Повертаємо індекс або -1, якщо немає непарних елементів
    }

    // Головний метод для запуску програми
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість елементів масиву: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int index = findSmallestOddIndex(array);

        if (index != -1) {
            System.out.println("Найменший непарний елемент: " + array[index]);
            System.out.println("Індекс: " + index);
        } else {
            System.out.println("Непарних елементів немає.");
        }

        scanner.close();
    }
}

