package usecases.operations.datastructures;

import model.interfaces.PayDisposition;
import model.interfaces.PaySchedule;
import model.interfaces.PayType;
import usecases.policy.payschedule.BiWeekly;
import usecases.policy.paytype.Commisioned;
import usecases.unionmembership.SetUnionMembeshipRequest;

public class AddCommissionedEmployeeRequest extends AddEmployeeRequest {

	private PayType payType = new Commisioned();
	private PaySchedule paySchedule = new BiWeekly();
	
	public AddCommissionedEmployeeRequest(PayDisposition payDisposition,
			SetUnionMembeshipRequest setUnionMembeshipRequest, String firstName, String lastName) {
		super(payDisposition, setUnionMembeshipRequest, firstName, lastName);
	}

	public PayType getPayType() {
		return payType;
	}

	public PaySchedule getPaySchedule() {
		return paySchedule;
	}
	
	

}
