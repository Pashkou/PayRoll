package usecases.policy.payschedule;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import model.interfaces.PaySchedule;

public class BiWeekly implements PaySchedule {

	private LocalDate lastPayment = null;

	public void setLastPayment(LocalDate lastPayment) {
		this.lastPayment = lastPayment;
	}

	public boolean shouldPay(LocalDate currentDate) {
		long weeksBetween = ChronoUnit.WEEKS.between(lastPayment, currentDate);
		if(weeksBetween > 1)
			return true;
		return false;
	}

}
