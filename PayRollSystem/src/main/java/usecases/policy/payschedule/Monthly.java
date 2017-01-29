package usecases.policy.payschedule;

import java.time.LocalDate;
import java.time.Period;

import model.interfaces.PaySchedule;

public class Monthly implements PaySchedule {
	private LocalDate lastPayment = null;

	public void setLastPayment(LocalDate lastPayment) {
		this.lastPayment = lastPayment;
	}

	public boolean shouldPay(LocalDate currentDate) {
		Period period = Period.between(lastPayment, currentDate);
		if(period.getMonths() > 0)
			return true;
		return false;
	}

}
