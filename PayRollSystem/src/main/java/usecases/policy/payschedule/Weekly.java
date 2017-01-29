package usecases.policy.payschedule;

import java.time.LocalDate;
import model.interfaces.PaySchedule;

public class Weekly implements PaySchedule {

	public boolean shouldPay(LocalDate date) {
		return false;
	}

}
