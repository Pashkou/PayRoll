package usecases.operations;

import model.Employee;
import model.EmployeeGateway;
import usecases.operations.datastructures.AddHourlyEmployeeRequest;
import usecases.policy.paytype.Hourly;
import usecases.policy.paytype.TimeCard;

public class AddTimeCardUsecase implements UseCase<AddHourlyEmployeeRequest> {

	public void execute(AddHourlyEmployeeRequest addEmployeeRequest) {
		Employee employee = EmployeeGateway.getEmployee();
		TimeCard timecard = new TimeCard();
		Hourly payType = (Hourly)employee.getPayType();
		payType.addTimeCard(timecard);

	}

}
