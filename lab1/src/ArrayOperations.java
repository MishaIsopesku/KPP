import java.util.Random;
import java.util.Scanner;

public class ArrayOperations {

    public int[] array;

    public ArrayOperations(int size) {
        array = new int[size];
    }

    // Метод для заповнення масиву випадковими числами
    private void fillArrayRandomly() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100; // Генерація чисел в діапазоні [-100; 100]
        }
    }

    // Метод для заповнення масиву вручну
    private void fillArrayManually() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть " + array.length + " чисел (в межах [-100; 100]):");
        for (int i = 0; i < array.length; i++) {
            while (true) {
                int input = scanner.nextInt();
                if (input >= -100 && input <= 100) {
                    array[i] = input;
                    break;
                } else {
                    System.out.print("Неправильне значення. Спробуйте ще раз: ");
                }
            }
        }
    }

    public int findMaxIndex() throws IllegalArgumentException {
        if (array.length == 0) {
            throw new IllegalArgumentException("Масив порожній.");
        }
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public int sumOfAbsoluteValuesBetweenZeros() throws IllegalArgumentException {
        int firstZeroIndex = -1;
        int lastZeroIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                if (firstZeroIndex == -1) {
                    firstZeroIndex = i;
                }
                lastZeroIndex = i;
            }
        }

        if (firstZeroIndex == -1 || lastZeroIndex == -1 || firstZeroIndex == lastZeroIndex) {
            throw new IllegalArgumentException("Немає достатньої кількості нульових елементів для обчислення.");
        }

        int sum = 0;
        for (int i = firstZeroIndex + 1; i < lastZeroIndex; i++) {
            sum += Math.abs(array[i]);
        }
        return sum;
    }

    public void printArray() {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();

        ArrayOperations operations = new ArrayOperations(size);

        System.out.println("Оберіть спосіб заповнення масиву:");
        System.out.println("1. Ввести вручну");
        System.out.println("2. Заповнити випадковими числами");
        int choice = scanner.nextInt();

        if (choice == 1) {
            operations.fillArrayManually();
        } else if (choice == 2) {
            operations.fillArrayRandomly();
        } else {
            System.out.println("Неправильний вибір!");
            return;
        }

        operations.printArray();

        try {
            int maxIndex = operations.findMaxIndex();
            System.out.println("Індекс максимального елемента: " + maxIndex);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            int sum = operations.sumOfAbsoluteValuesBetweenZeros();
            System.out.println("Сума модулів елементів між нульовими елементами: " + sum);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
