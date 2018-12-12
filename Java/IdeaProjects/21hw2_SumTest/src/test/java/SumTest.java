import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumTest {
    private int a = 1, b = 2;
    private double c = 1.2, d = 3.4;
    private byte e = 2, f = 3;
    private long g = 4, h = 5;
    private float i = 6, j = 7;
    private short k = -1, l = -2;

    @Test
    public void twoSumTest() {
        assertEquals(3,Sum.twoSum(a,b),0.01);
        assertEquals(4.6,Sum.twoSum(c,d),0.01);
        assertEquals(5,Sum.twoSum(e,f),0.01);
        assertEquals(9,Sum.twoSum(g,h),0.01);
        assertEquals(13,Sum.twoSum(i,j),0.01);
        assertEquals(-3,Sum.twoSum(k,l),0.01);
    }
}
