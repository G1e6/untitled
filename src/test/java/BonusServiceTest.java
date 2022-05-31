import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    @Test
    public void testShouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long expected = 30;
        long actual = service.calculate(1000, true);
        //System.out.println(bonus);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testShouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long expected = 500;
        long actual = service.calculate(1000000, true);
        //System.out.println(bonus);

        Assertions.assertEquals(expected, actual);
    }

}
