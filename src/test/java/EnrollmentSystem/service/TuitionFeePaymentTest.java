package EnrollmentSystem.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TuitionFeePaymentTest {

    private TuitionFeePayment tuitionFeePayment;

    @BeforeEach
    void setup(){
        tuitionFeePayment = new TuitionFeePayment();
    }

    @Test
    void shouldCalculateTuitionfee(){

        assertEquals(3000.0, tuitionFeePayment.calculateTuitionFee(3, 0));
    }

    @Test
    void shouldCalculateTuitionfeewithDiscount(){

        assertEquals(2700.0, tuitionFeePayment.calculateTuitionFee(3, 0.10));
    }

    @Test
    void shouldMakePayment(){

        tuitionFeePayment.calculateTuitionFee(3,0.10);
        tuitionFeePayment.makePayment(2700.0);
        assertEquals(0, tuitionFeePayment.getRemainingBalance());
    }

    @Test
    void shouldCheckIfFullyPaid(){

        tuitionFeePayment.calculateTuitionFee(3,0.10);
        tuitionFeePayment.makePayment(2700.0);
        assertTrue(tuitionFeePayment.isFullyPaid());
    }

    @Test
    void shouldCheckIfNotFullyPaid(){
        tuitionFeePayment.calculateTuitionFee(3,0.10);
        tuitionFeePayment.makePayment(1000.0);
        assertFalse(tuitionFeePayment.isFullyPaid());
    }

}