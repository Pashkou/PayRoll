package usecases.operations;

import usecases.operations.datastructures.AddHourlyEmployeeRequest;

public class AddHourlyEmployeeUsecase extends AddEmployeeUsecase{
	
	public AddHourlyEmployeeUsecase(AddHourlyEmployeeRequest addHourlyEmployeeRequest) {
		super(
				addHourlyEmployeeRequest.getPayDisposition(),
				addHourlyEmployeeRequest.getPaySchedule(),
				addHourlyEmployeeRequest.getPayType());
	}
	
}
