package usecases.policy.payschedule;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class WeeklyTest {

	private Weekly weekly;
	
	@Before
	public void setUp(){
		weekly = new Weekly();
	}
	
	@Test
	public void shouldPayToEmployee() throws ParseException{
		LocalDate today = LocalDate.now();
		weekly.setLastPayment(LocalDate.of(2017, 01, 21));
        assertTrue(weekly.shouldPay(today));
	}
	
	@Test
	public void shouldNotPayToEmployee() throws ParseException{
		LocalDate today = LocalDate.now();
		weekly.setLastPayment(LocalDate.of(2017, 01, 27));
        assertFalse(weekly.shouldPay(today));
	}

}
