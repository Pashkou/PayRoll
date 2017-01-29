package model.interfaces;

import java.time.LocalDate;

public interface PaySchedule {
	public boolean shouldPay(LocalDate date);
}
