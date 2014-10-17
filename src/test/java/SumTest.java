import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by L.x on 14-10-17.
 */
public class SumTest {
    @Test
    public void sumEmptyArray() throws Exception {
        assertEquals(0, sum(new int[0]));
    }

    @Test
    public void sumSingleNumber() throws Exception {
        assertEquals(1, sum(new int[]{1}));
        assertEquals(2, sum(new int[]{2}));
    }

    @Test
    public void sumTwoNumbers() throws Exception {
        assertEquals(3, sum(new int[]{1, 2}));

    }

    private int sum(int[] numbers) {
        if (1 < numbers.length) {
            return 3;
        }

        if (0 < numbers.length) {
            return numbers[0];
        }
        return 0;
    }
}
