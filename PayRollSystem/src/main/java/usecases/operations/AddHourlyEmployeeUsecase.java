package usecases.operations;

import model.Employee;
import model.interfaces.PayDisposition;
import model.interfaces.PaySchedule;
import model.interfaces.PayType;
import usecases.policy.payschedule.Monthly;
import usecases.policy.paytype.Hourly;

public class AddHourlyEmployeeUsecase extends AddEmployeeUsecase{

	@Override
	public void addEmployee(AddEmployeeRequest addEmployeeRequest) {
		
		PayDisposition payDisposition = addEmployeeRequest.getPayDisposition();
		PaySchedule paySchedule = new Monthly();//?
		PayType payType = new Hourly();
		
		Employee employee = new Employee(payDisposition, paySchedule, payType, null, "firstName", "lastName");
		
	}
	
}
