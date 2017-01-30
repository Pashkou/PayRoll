package usecases.operations;

import model.Employee;
import usecases.operations.datastructures.AddHourlyEmployeeRequest;

public class AddHourlyEmployeeUsecase implements UseCase<AddHourlyEmployeeRequest>{
	
	public AddHourlyEmployeeUsecase() {

	}

	public void execute(AddHourlyEmployeeRequest addEmployeeRequest) {
		Employee employee = new Employee(
				addEmployeeRequest.getPayDisposition(),
				addEmployeeRequest.getPaySchedule(),
				addEmployeeRequest.getPayType(),
				null,
				addEmployeeRequest.getFirstName(),
				addEmployeeRequest.getLastName());
		
		//employeeDAO - interface - save
	}
	
}
