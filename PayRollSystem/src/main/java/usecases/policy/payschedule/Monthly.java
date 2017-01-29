package usecases.policy.payschedule;

import java.util.Calendar;
import java.util.Date;

import model.interfaces.PaySchedule;

public class Monthly implements PaySchedule {
	private Date lastPayment = null;
	private Calendar cal = Calendar.getInstance();

	public Monthly() {
		lastPayment = new Date();
	}

	public void setLastPayment(Date lastPayment) {
		this.lastPayment = lastPayment;
	}

	public boolean shouldPay(Date currentdate) {
		cal.setTime(lastPayment);
	    int numberOfLastPaymentMonth = cal.get(Calendar.MONTH);
	    
	    cal.setTime(currentdate);
	    int numberOfcurrentdate = cal.get(Calendar.MONTH);
	    
	    System.out.println("lastPayment " + numberOfLastPaymentMonth + "; numberOfcurrentdata "+numberOfcurrentdate);
		return true;
	}

}
