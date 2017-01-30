package usecases.operations.datastructures;

import model.interfaces.PayDisposition;
import usecases.unionmembership.SetUnionMembeshipRequest;

public abstract class AddEmployeeRequest {
	
	private PayDisposition payDisposition;
	private SetUnionMembeshipRequest setUnionMembeshipRequest;
	
	public AddEmployeeRequest(PayDisposition payDisposition, SetUnionMembeshipRequest setUnionMembeshipRequest) {
		this.payDisposition = payDisposition;
		this.setUnionMembeshipRequest = setUnionMembeshipRequest;
	}
	
	public PayDisposition getPayDisposition() {
		return payDisposition;
	}
	
	public SetUnionMembeshipRequest getUnion_membership() {
		return setUnionMembeshipRequest;
	}
}
