package usecases.policy.payschedule;

import java.util.Date;

import model.interfaces.PaySchedule;

public class BiWeekly implements PaySchedule {

	public boolean shouldPay(Date date) {
		return false;
	}

}
