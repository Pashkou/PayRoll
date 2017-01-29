package usecases.policy.payschedule;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class MonthlyTest {
	private Monthly monthly;
	
	@Before
	public void setUp(){
		monthly = new Monthly();
	}
	
	@Test
	public void shouldPayToEmployee() throws ParseException{
		LocalDate today = LocalDate.now();
		monthly.setLastPayment(LocalDate.of(2016, 11, 29));
        assertTrue(monthly.shouldPay(today));
	}

	
	@Test
	public void shouldNotPayToEmployee() throws ParseException{
		LocalDate today = LocalDate.now();
		monthly.setLastPayment(today);
        assertFalse(monthly.shouldPay(today));
	}

}
