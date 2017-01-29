package usecases.policy.payschedule;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

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
		 Date date = new Date();
         assertTrue(monthly.shouldPay(date));
	}

	@Test
	public void shouldNotPayToEmployee() throws ParseException{
		Calendar myCal = Calendar.getInstance();
		myCal.set(Calendar.YEAR, 2016);
		myCal.set(Calendar.MONTH, 12);
		myCal.set(Calendar.DAY_OF_MONTH, 1);
		
		monthly.setLastPayment(myCal.getTime());
        assertTrue(monthly.shouldPay(new Date()));
	}

}
