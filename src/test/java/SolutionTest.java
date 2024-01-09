import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        int maxChoosableInteger = 10;
        int desiredTotal = 11;
        boolean expected = false;
        boolean actual = new Solution().canIWin(maxChoosableInteger, desiredTotal);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        int maxChoosableInteger = 10;
        int desiredTotal = 0;
        boolean expected = true;
        boolean actual = new Solution().canIWin(maxChoosableInteger, desiredTotal);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        int maxChoosableInteger = 10;
        int desiredTotal = 1;
        boolean expected = true;
        boolean actual = new Solution().canIWin(maxChoosableInteger, desiredTotal);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test4(){
        int maxChoosableInteger = 4;
        int desiredTotal = 6;
        boolean expected = true;
        boolean actual = new Solution().canIWin(maxChoosableInteger, desiredTotal);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test5(){
        int maxChoosableInteger = 10;
        int desiredTotal = 40;
        boolean expected = false;
        boolean actual = new Solution().canIWin(maxChoosableInteger, desiredTotal);

        Assert.assertEquals(expected, actual);
    }
}
