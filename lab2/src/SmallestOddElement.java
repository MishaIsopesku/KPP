public class SmallestOddElement {

    // Підпрограма для пошуку індексу найменшого непарного елемента
    public static int findSmallestOddIndex(int[] array) {
        int minOdd = Integer.MAX_VALUE; // змінна для найменшого непарного елемента
        int minOddIndex = -1; // змінна для індексу найменшого непарного елемента

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
        int[] array = {12, 15, 7, 22, 33, 9, 50}; // Масив
        int index = findSmallestOddIndex(array);

        if (index != -1) {
            System.out.println("Найменший непарний елемент: " + array[index]);
            System.out.println("Індекс: " + index);
        } else {
            System.out.println("Непарних елементів немає.");
        }
    }
}
