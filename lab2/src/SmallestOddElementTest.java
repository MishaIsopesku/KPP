import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SmallestOddElementTest {

    // Тест для знаходження індексу найменшого непарного елемента
    @Test
    public void testFindSmallestOddIndex() {
        int[] array = {2, 3, 5, 7, 9, 11};
        assertEquals(0, SmallestOddElement.findSmallestOddIndex(array));
    }
}

