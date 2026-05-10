package EnrollmentSystem.service;

import EnrollmentSystem.model.Student;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TuitionFeePaymentTest {

    private TuitionFeePayment tuitionFeePayment;
    private Student student;

    @BeforeEach
    void setup() {
        tuitionFeePayment = new TuitionFeePayment();
        student = new Student(1, "Alice", "BSIT");
    }

    @Test
    void shouldCalculateTuitionFee() {
        assertEquals(3000.0, tuitionFeePayment.calculateTuitionFee(student, 3, 0));
    }

    @Test
    void shouldCalculateTuitionFeeWithDiscount() {
        assertEquals(2700.0, tuitionFeePayment.calculateTuitionFee(student, 3, 0.10));
    }

    @Test
    void shouldMakePayment() {
        tuitionFeePayment.calculateTuitionFee(student, 3, 0.10);
        tuitionFeePayment.makePayment(student, 2700.0);
        assertEquals(0, tuitionFeePayment.getRemainingBalance(student));
    }

    @Test
    void shouldCheckIfFullyPaid() {
        tuitionFeePayment.calculateTuitionFee(student, 3, 0.10);
        tuitionFeePayment.makePayment(student, 2700.0);
        assertTrue(tuitionFeePayment.isFullyPaid(student));
    }

    @Test
    void shouldCheckIfNotFullyPaid() {
        tuitionFeePayment.calculateTuitionFee(student, 3, 0.10);
        tuitionFeePayment.makePayment(student, 1000.0);
        assertFalse(tuitionFeePayment.isFullyPaid(student));
    }

    @Test
    void shouldRejectNegativePayment() {
        tuitionFeePayment.calculateTuitionFee(student, 3, 0);
        tuitionFeePayment.makePayment(student, -500);
        assertEquals(3000.0, tuitionFeePayment.getRemainingBalance(student));
    }

    @Test
    void shouldRejectOverpayment() {
        tuitionFeePayment.calculateTuitionFee(student, 3, 0);
        tuitionFeePayment.makePayment(student, 9999.0);
        assertEquals(3000.0, tuitionFeePayment.getRemainingBalance(student));
    }

    @Test
    void shouldApplyFullScholarship() {
        tuitionFeePayment.calculateTuitionFee(student, 3, 0);
        tuitionFeePayment.applyScholarshipDiscount(student, "full");
        assertEquals(0.0, tuitionFeePayment.getRemainingBalance(student));
    }

    @Test
    void shouldApplyPartialScholarship() {
        tuitionFeePayment.calculateTuitionFee(student, 3, 0);
        tuitionFeePayment.applyScholarshipDiscount(student, "partial");
        assertEquals(1500.0, tuitionFeePayment.getRemainingBalance(student));
    }

    @Test
    void shouldApplyAcademicScholarship() {
        tuitionFeePayment.calculateTuitionFee(student, 3, 0);
        tuitionFeePayment.applyScholarshipDiscount(student, "academic");
        assertEquals(2250.0, tuitionFeePayment.getRemainingBalance(student));
    }

    @Test
    void shouldRejectInvalidScholarshipType() {
        tuitionFeePayment.calculateTuitionFee(student, 3, 0);
        double balanceBefore = tuitionFeePayment.getRemainingBalance(student);
        tuitionFeePayment.applyScholarshipDiscount(student, "invalid");
        assertEquals(balanceBefore, tuitionFeePayment.getRemainingBalance(student));
    }
}