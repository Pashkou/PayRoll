package usecases.operations;

import usecases.operations.datastructures.AddCommissionedEmployeeRequest;

public class AddCommissionedEmployeeUsecase extends AddEmployeeUsecase{

	public AddCommissionedEmployeeUsecase(AddCommissionedEmployeeRequest addCommissionedEmployeeRequest) {
		super(
				addCommissionedEmployeeRequest.getPayDisposition(),
				addCommissionedEmployeeRequest.getPaySchedule(),
				addCommissionedEmployeeRequest.getPayType());
	}

}
