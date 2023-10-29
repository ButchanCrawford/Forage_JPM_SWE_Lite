public class RewardValue {

    //attributes
    private double cashValue;
    private  int mileValue;
    public double milesToCashConvertRate = 0.0035;

    // constructor(cash) - cash to miles
    public RewardValue(double cash){
        this.cashValue = cash;
        this.mileValue = (int) (cash / milesToCashConvertRate);
    }

    // constructor(miles) - miles to cash
    public RewardValue(int miles) {
        this.mileValue = miles;
        this.cashValue = miles * milesToCashConvertRate;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return this.mileValue;
    }

}
