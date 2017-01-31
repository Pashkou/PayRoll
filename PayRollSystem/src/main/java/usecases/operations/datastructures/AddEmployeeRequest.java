package usecases.operations.datastructures;

import model.interfaces.PayDisposition;
import usecases.unionmembership.SetUnionMembeshipRequest;

public abstract class AddEmployeeRequest extends Request {
	
	private PayDisposition payDisposition;
	private SetUnionMembeshipRequest setUnionMembeshipRequest;
	
	private String firstName;
	private String lastName;
	
	public AddEmployeeRequest(PayDisposition payDisposition, SetUnionMembeshipRequest setUnionMembeshipRequest) {
		super();
		this.payDisposition = payDisposition;
		this.setUnionMembeshipRequest = setUnionMembeshipRequest;
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

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
