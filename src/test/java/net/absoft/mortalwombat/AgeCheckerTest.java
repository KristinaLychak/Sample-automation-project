package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {

    @Test
    public void TestAgedUserCanPlay() {
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.CanPlayGame(22), "Aged user can play game");
    }

    @Test
    public void testThatTooYongUsersCanNotPlay () {
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertFalse(ageChecker.CanPlayGame(17), "Aged user can play game");
    }

}