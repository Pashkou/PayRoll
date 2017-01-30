package usecases.operations;

import model.interfaces.PayDisposition;

public abstract class AddEmployeeRequest {
	
	private PayDisposition payDisposition;
	private boolean union_membership;
	
	public AddEmployeeRequest(PayDisposition payDisposition, boolean union_membership) {
		this.payDisposition = payDisposition;
		this.union_membership = union_membership;
	}
	
	public PayDisposition getPayDisposition() {
		return payDisposition;
	}
	
	public boolean isUnion_membership() {
		return union_membership;
	}
}
