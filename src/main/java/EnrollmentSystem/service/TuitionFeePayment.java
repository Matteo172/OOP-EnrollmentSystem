package EnrollmentSystem.service;

public class TuitionFeePayment implements TuitionReg {

    private final double PRICE_PER_UNIT = 1000.00;
    private double Balance;
    private double totalTuition;

    public double calculateTuitionFee(int units, double discountRate){
        totalTuition = PRICE_PER_UNIT * units;
        if(discountRate != 0){
            totalTuition = totalTuition - (totalTuition * discountRate);
        }
        Balance = totalTuition;
        return totalTuition;
    }

    public void makePayment(double amount){
        if (amount <= 0) {
            System.out.println("Error: Payment amount must be greater than zero.");
            return;
        }
        if (amount > Balance) {
            System.out.println("Error: Payment exceeds remaining balance. Remaining balance is: " + Balance);
            return;
        }
        Balance = Balance - amount;
    }

    public double getRemainingBalance(){
        return Balance;
    }

    public boolean isFullyPaid(){
        return Balance == 0;
    }

}
