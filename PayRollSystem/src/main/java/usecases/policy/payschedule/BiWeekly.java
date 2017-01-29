package usecases.policy.payschedule;

import java.time.LocalDate;
import model.interfaces.PaySchedule;

public class BiWeekly implements PaySchedule {

	public boolean shouldPay(LocalDate date) {
		return false;
	}

}
