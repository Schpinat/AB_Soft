package Solution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionGradleTest {

    @Test
    public void testWhenDisMoreThenZero () { //Для дискримінанта > 0 має бути знайдено два різні корені
    Solution solution = new Solution();
    Assert.assertEquals(solution.resultDis(1,-4,-5),"[5.0, -1.0]","Error in calculating the roots of the equation, expected two different values in the roots");
}
    @Test
    public void testWhenDisLessThenZero () { //Для дискримінанта < 0 має повертатися null
        Solution solution = new Solution();
        Assert.assertEquals(solution.resultDis(3,-4,2),null,"Error in calculation of equation roots, expected null");
    }

    @Test
    public void testWhenDisEqualZero () { //Для дискримінанта = 0 має бути знайдено два однакових корені
        Solution solution = new Solution();
        Assert.assertEquals(solution.resultDis(3,-18,27),"[3.0, 3.0]","Error in calculating the roots of the equation, two identical values were expected in the roots");
    }
}
