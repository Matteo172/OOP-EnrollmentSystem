package EnrollmentSystem.service;

import EnrollmentSystem.model.Student;

public interface TuitionReg {
    double calculateTuitionFee(Student student, int units, double discountRate);
    void makePayment(Student student, double amount);
    double getRemainingBalance(Student student);
    boolean isFullyPaid(Student student);
}