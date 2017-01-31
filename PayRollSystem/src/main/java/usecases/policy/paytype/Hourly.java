package usecases.policy.paytype;

import java.util.ArrayList;
import java.util.List;

import model.interfaces.PayType;

public class Hourly implements PayType {
	private List<TimeCard> timeCards = new ArrayList<TimeCard>();
	
	public void addTimeCard(TimeCard timeCard){
		timeCards.add(timeCard);
	}
}
