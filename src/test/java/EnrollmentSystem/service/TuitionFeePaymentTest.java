package EnrollmentSystem.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TuitionFeePaymentTest {

    public TuitionFeePayment tuitionFeePayment;

    @BeforeEach
    void setup(){
        tuitionFeePayment = new TuitionFeePayment();
    }

    @Test
    void shouldCalculateTuitionfee(){

        tuitionFeePayment.calculateTuitionFee(16, 0.10);
        assertEquals(14400.00, tuitionFeePayment.getRemainingBalance());

    }

    @Test
    void shouldMakePayment(){

        tuitionFeePayment.calculateTuitionFee(16,0.10);
        tuitionFeePayment.makePayment(14400.00);
        assertEquals(0, tuitionFeePayment.getRemainingBalance());
    }

    @Test
    void shouldFullyPaid(){

        assertTrue(tuitionFeePayment.isFullyPaid());
    }



}