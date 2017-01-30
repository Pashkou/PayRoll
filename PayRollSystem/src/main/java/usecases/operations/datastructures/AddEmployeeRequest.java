package usecases.operations.datastructures;

import model.interfaces.PayDisposition;
import usecases.unionmembership.SetUnionMembeshipRequest;

public abstract class AddEmployeeRequest {
	
	private PayDisposition payDisposition;
	private SetUnionMembeshipRequest setUnionMembeshipRequest;
	
	private String firstName;
	private String lastName;
	
	public AddEmployeeRequest(PayDisposition payDisposition, SetUnionMembeshipRequest setUnionMembeshipRequest,
			String firstName, String lastName) {
		super();
		this.payDisposition = payDisposition;
		this.setUnionMembeshipRequest = setUnionMembeshipRequest;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public PayDisposition getPayDisposition() {
		return payDisposition;
	}
	
	public SetUnionMembeshipRequest getUnion_membership() {
		return setUnionMembeshipRequest;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
