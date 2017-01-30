package usecases.operations.datastructures;

import model.interfaces.PayDisposition;
import model.interfaces.PaySchedule;
import model.interfaces.PayType;
import usecases.policy.payschedule.Weekly;
import usecases.policy.paytype.Hourly;
import usecases.unionmembership.SetUnionMembeshipRequest;

public class AddHourlyEmployeeRequest extends AddEmployeeRequest {

	private PayType payType = new Hourly();
	private PaySchedule paySchedule = new Weekly();
	
	public AddHourlyEmployeeRequest(PayDisposition payDisposition, SetUnionMembeshipRequest setUnionMembeshipRequest, String firstName, String lastName) {
		super(payDisposition, setUnionMembeshipRequest, firstName, lastName);
	}

	public PayType getPayType() {
		return payType;
	}

	public PaySchedule getPaySchedule() {
		return paySchedule;
	}


}
