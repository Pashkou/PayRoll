package usecases.operations.controller;

import usecases.operations.AddCommissionedEmployeeUsecase;
import usecases.operations.AddHourlyEmployeeUsecase;
import usecases.operations.datastructures.AddCommissionedEmployeeRequest;
import usecases.operations.datastructures.AddHourlyEmployeeRequest;

public interface RequestBuilder {
	public AddHourlyEmployeeRequest buildAddHourlyEmployee();
	public AddHourlyEmployeeUsecase makeAddHourlyEmployee();
}
