package usecases.operations.controller;

import usecases.operations.AddHourlyEmployeeUsecase;
import usecases.operations.datastructures.AddHourlyEmployeeRequest;

public class AddEmployeeController {
	private RequestBuilder requestBuilder;
	
	public void addEmployee(){
		addHourlyEmployee();
	}

	private void addHourlyEmployee() {
		AddHourlyEmployeeRequest addHourlyEmployeeRequest = requestBuilder.buildAddHourlyEmployee();
		AddHourlyEmployeeUsecase addHourlyEmployeeUsecase = requestBuilder.makeAddHourlyEmployee();
		addHourlyEmployeeUsecase.execute(addHourlyEmployeeRequest);
	}
}
