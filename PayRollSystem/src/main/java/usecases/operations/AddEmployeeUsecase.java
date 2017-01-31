package usecases.operations;

import model.Employee;
import model.interfaces.UnionMembership;
import usecases.unionmembership.SetUnionMembershipUsecase;
import usecases.unionmembership.SetUnionMembeshipRequest;

public class AddEmployeeUsecase {
	
	private Employee employee;
	private SetUnionMembershipUsecase setUnionMembershipUsecase = new SetUnionMembershipUsecase();
	private SetUnionMembeshipRequest setUnionMembeshipRequest;
	
	public void setSetUnionMembeshipRequest(SetUnionMembeshipRequest setUnionMembeshipRequest) {
		this.setUnionMembeshipRequest = setUnionMembeshipRequest;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public void execute(){
		UnionMembership unionMembership = setUnionMembershipUsecase.getUnionMembership(setUnionMembeshipRequest);
		employee.setUnionMemebership(unionMembership);
	}

}
