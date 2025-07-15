package otherFolder.test;

import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.Test;
public class Testers {
    @Test
    public void sampleTest1() {
        int[] result = TwoSum.twoSum(new int[] {3, 2, 4}, 6);
        assertArrayEquals(new int[] {1, 2}, result);
    }
    @Test
    public void sampleTest2() {
        int[] result = TwoSum.twoSum(new int[] {2, 7, 11, 15}, 9);
        assertArrayEquals(new int[] {0, 1}, result);
    }
    @Test
    public void sampleTest3() {
        int[] result = TwoSum.twoSum(new int[] {2, 3, 6, 6}, 20);
        assertArrayEquals(result, null);

    }
}