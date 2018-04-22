package peoples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {
 Calculation testingClass;

    @BeforeEach
   void setUp() {
        testingClass = new Calculation();
    }
	
    @Test
    void calc_n() {
        assertEquals(1300, Calculation.Calc_n(13, 10000));
    }
	
	    @Test
    void calc_n2() {
        assertEquals(1500, Calculation.Calc_n(15, 10000));
    }
	
	    @Test
    void calc_n3() {
        assertEquals(11500, Calculation.Calc_n(23, 50000));
    }
	
	    @Test
    void calc_n4() {
        assertEquals(4320, Calculation.Calc_n(18, 24000));
    }
	
		@Test
    void calc_n5() {
        assertEquals(630, Calculation.Calc_n(9, 7000));
    }
	    
		@Test
    void calc_n6() {
        assertEquals(1920, Calculation.Calc_n(12, 16000));
    }
	
	@Test
    void calc_n7() {
        assertEquals(3825, Calculation.Calc_n(17, 22500));
    }
	
    @Test
    void calc_n8() {
        assertEquals(39600, Calculation.Calc_n(33, 120000));
    }
}
