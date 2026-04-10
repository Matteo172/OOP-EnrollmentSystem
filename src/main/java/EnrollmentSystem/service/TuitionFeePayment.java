package EnrollmentSystem.service;

public class    TuitionFeePayment {

    private final double PRICE_PER_UNIT = 1000.00;
    private double Balance;
    private double totalTuition;

    public double calculateTuitionFee(int units, double discountRate){
        totalTuition = PRICE_PER_UNIT * units;
        if(discountRate != 0){
            totalTuition = totalTuition - (totalTuition * discountRate);
        }
        return totalTuition;
    }

    public void makePayment(double amount){
        Balance = totalTuition - amount;
    }

    public double getRemainingBalance(){
        return Balance;
    }

    public boolean isFullyPaid(){
        return Balance == 0;
    }

}
