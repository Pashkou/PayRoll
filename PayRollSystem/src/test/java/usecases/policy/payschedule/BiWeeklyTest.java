package usecases.policy.payschedule;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class BiWeeklyTest {
	private BiWeekly beWeekly;
	
	@Before
	public void setUp(){
		beWeekly = new BiWeekly();
	}
	
	@Test
	public void shouldPayToEmployee() throws ParseException{
		LocalDate today = LocalDate.now();
		beWeekly.setLastPayment(LocalDate.of(2017, 01, 15));
        assertTrue(beWeekly.shouldPay(today));
	}
	
	@Test
	public void shouldNotPayToEmployee() throws ParseException{
		LocalDate today = LocalDate.now();
		beWeekly.setLastPayment(LocalDate.of(2017, 01, 17));
        assertFalse(beWeekly.shouldPay(today));
	}
}
