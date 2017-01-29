package usecases.policy.paytype;

import java.util.List;

import model.interfaces.PayType;

public class Hourly implements PayType {
	private List<TimeCard> timeCards;
}
