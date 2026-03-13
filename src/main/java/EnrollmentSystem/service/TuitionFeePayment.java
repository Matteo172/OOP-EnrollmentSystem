package EnrollmentSystem.service;

import java.math.BigDecimal;

public class TuitionFeePayment {

    private double pricePerUnit = 1000.00;
    private double Balance;
    private double totalTuition;

    public double calculateTuitionFee(int units, double discountRate){
        totalTuition = pricePerUnit * units * (1-discountRate);
        Balance = totalTuition;
        return Balance;
    }

    public void makePayment(double amount){
        Balance = Balance - amount;
    }

    public double getRemainingBalance(){
        return Balance;
    }

    public boolean isFullyPaid(){
        return Balance == 0;
    }


}
