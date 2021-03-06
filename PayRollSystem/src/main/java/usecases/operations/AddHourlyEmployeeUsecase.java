package usecases.operations;

import model.Employee;
import usecases.operations.datastructures.AddHourlyEmployeeRequest;

public class AddHourlyEmployeeUsecase extends AddEmployeeUsecase implements UseCase<AddHourlyEmployeeRequest> {
	
	public void execute(AddHourlyEmployeeRequest addHourlyEmployeeRequest) {
		Employee employee = new Employee.Builder(addHourlyEmployeeRequest.getFirstName(),
				addHourlyEmployeeRequest.getLastName()).
					payDisposition(addHourlyEmployeeRequest.getPayDisposition()).
					paySchedule(addHourlyEmployeeRequest.getPaySchedule()).
					payType(addHourlyEmployeeRequest.getPayType()).
					build();
		super.setEmployee(employee);
		super.execute();
	}
	
}
