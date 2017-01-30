package usecases.operations;

import model.Employee;
import model.interfaces.PayDisposition;
import model.interfaces.PaySchedule;
import model.interfaces.PayType;
import model.interfaces.UnionMembership;
import usecases.unionmembership.SetUnionMembershipUsecase;

public abstract class AddEmployeeUsecase {
	private PayDisposition payDisposition;
	private PaySchedule paySchedule;
	private PayType payType;
	private UnionMembership unionMembership = null;
	
	private SetUnionMembershipUsecase setUnionMembershipUsecase; 
	
	public AddEmployeeUsecase(PayDisposition payDisposition, PaySchedule paySchedule, PayType payType){
		this.payDisposition = payDisposition;
		this.paySchedule = paySchedule;
		this.payType = payType;
	}

	public void addEmployee(){
		if(unionMembership == null){
			unionMembership = setUnionMembershipUsecase.getUnionMembership(null);
		}
		
		Employee employee = new Employee(payDisposition, paySchedule, payType, unionMembership, "firstName", "lastName");
	}
	
	
	
}
