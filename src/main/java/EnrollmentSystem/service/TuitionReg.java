package EnrollmentSystem.service;

public interface TuitionReg {
    double calculateTuitionFee(int units, double discountRate);
    void makePayment(double amount);
    double getRemainingBalance();
    boolean isFullyPaid();
}
