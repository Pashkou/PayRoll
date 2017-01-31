package usecases.operations;

import model.Employee;
import usecases.operations.datastructures.AddCommissionedEmployeeRequest;

public class AddCommissionedEmployeeUsecase extends AddEmployeeUsecase implements UseCase<AddCommissionedEmployeeRequest>{

	public void execute(AddCommissionedEmployeeRequest addCommisionedEmployeeRequest) {
		Employee employee = new Employee.Builder(addCommisionedEmployeeRequest.getFirstName(),
				addCommisionedEmployeeRequest.getLastName()).
				payDisposition(addCommisionedEmployeeRequest.getPayDisposition()).
				paySchedule(addCommisionedEmployeeRequest.getPaySchedule()).
				payType(addCommisionedEmployeeRequest.getPayType()).
				build();
		super.setEmployee(employee);
		super.execute();
	}

}
