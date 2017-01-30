package usecases.operations.controller;

import usecases.operations.AddHourlyEmployeeUsecase;
import usecases.operations.datastructures.AddHourlyEmployeeRequest;

public interface RequestBuilder {
	public AddHourlyEmployeeRequest buildAddHourlyEmployee();
	public AddHourlyEmployeeUsecase makeAddHourlyEmployee();
}
