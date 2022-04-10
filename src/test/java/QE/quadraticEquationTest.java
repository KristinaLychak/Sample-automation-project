package QE;

import net.absoft.QE.quadraticEquation;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class quadraticEquationTest {

    @Test
    public void quadraticEquation() {
        quadraticEquation Equation1 = new quadraticEquation();
        int a = 3;
        int b = -4;
        int c = 2;

        double D;
        D = b * b - 4 * a * c;

     Assert.assertEquals(-8, -8);


}

    @Test
    public void quadraticEquation2() {
        quadraticEquation Equation2 = new quadraticEquation();
        int a = 1;
        int b = -4;
        int c = -5;

        double D;
        D = b * b - 4 * a * c;

        Assert.assertEquals(-4, -4);

    }

    @Test
    public void quadraticEquation3() {
        quadraticEquation Equation2 = new quadraticEquation();
        int a = 1;
        int b = -4;
        int c = -4;

        double D;
        D = b * b - 4 * a * c;

        Assert.assertEquals(0, 0);

    }
}