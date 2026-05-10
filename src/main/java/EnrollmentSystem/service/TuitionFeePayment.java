package EnrollmentSystem.service;

import EnrollmentSystem.model.Student;

public class TuitionFeePayment implements TuitionReg {

    private final double PRICE_PER_UNIT = 1000.00;

    @Override
    public double calculateTuitionFee(Student student, int units, double discountRate) {
        double total = PRICE_PER_UNIT * units;
        if (discountRate != 0) {
            total = total - (total * discountRate);
        }
        student.setTotalTuition(total);
        student.setTuitionBalance(total);
        return total;
    }

    @Override
    public void makePayment(Student student, double amount) {
        if (amount <= 0) {
            System.out.println("Error: Payment amount must be greater than zero.");
            return;
        }
        if (amount > student.getTuitionBalance()) {
            System.out.println("Error: Payment exceeds remaining balance. Remaining balance is: "
                    + student.getTuitionBalance());
            return;
        }
        student.setTuitionBalance(student.getTuitionBalance() - amount);
    }

    @Override
    public double getRemainingBalance(Student student) {
        return student.getTuitionBalance();
    }

    @Override
    public boolean isFullyPaid(Student student) {
        return student.getTuitionBalance() == 0 && student.getTotalTuition() > 0;
    }

    @Override
    public double applyScholarshipDiscount(Student student, String scholarshipType) {
        double discount = 0;

        if (scholarshipType.equalsIgnoreCase("full")) {
            discount = 1.0;
        } else if (scholarshipType.equalsIgnoreCase("partial")) {
            discount = 0.50;
        } else if (scholarshipType.equalsIgnoreCase("academic")) {
            discount = 0.25;
        } else {
            System.out.println("Invalid scholarship type.");
            return student.getTuitionBalance();
        }

        double discountedAmount = student.getTotalTuition() * discount;
        student.setTuitionBalance(student.getTotalTuition() - discountedAmount);
        System.out.println("Scholarship applied! New balance: " + student.getTuitionBalance());
        return student.getTuitionBalance();
    }
}