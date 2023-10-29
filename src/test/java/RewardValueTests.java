import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashToConvert = 25;
        int testValue = (int) (cashToConvert / RewardValue.milesToCashConvertRate);
        var rewardValue = new RewardValue(cashToConvert);
        assertEquals(testValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesToConvert = 999;
        double testValue = (milesToConvert * RewardValue.milesToCashConvertRate);
        var rewardValue = new RewardValue(milesToConvert);
        assertEquals(testValue, rewardValue.getCashValue());
    }
}
