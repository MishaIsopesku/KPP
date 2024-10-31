import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {

    @Test
            // Номер максимального елемента масиву
    void testFindMaxIndex() {
        ArrayOperations operations = new ArrayOperations(5);
        operations.array = new int[]{1, 2, 3, 4, 5};
        assertEquals(4, operations.findMaxIndex());
    }

    @Test
            // Сума між першим і другим нульовим значенням
    void testSumOfAbsoluteValuesBetweenZeros() {
        ArrayOperations operations = new ArrayOperations(6);
        operations.array = new int[]{1, 0, 5, 2, 0, 3};
        assertEquals(7, operations.sumOfAbsoluteValuesBetweenZeros());
    }
}

