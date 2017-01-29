package usecases.policy.payschedule;

import java.time.LocalDate;
import java.util.Calendar;

import model.interfaces.PaySchedule;

public class Monthly implements PaySchedule {
	private LocalDate lastPayment = null;
	private Calendar cal = Calendar.getInstance();

	public Monthly() {
		
	}

	public void setLastPayment(LocalDate lastPayment) {
		this.lastPayment = lastPayment;
	}

	public boolean shouldPay(LocalDate currentDate) {
		if(currentDate.getMonthValue() > lastPayment.getMonthValue())
			return true;
		return false;
	}

}
