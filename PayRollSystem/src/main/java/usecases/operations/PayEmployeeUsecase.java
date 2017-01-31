package usecases.operations;

import java.time.LocalDate;
import java.util.List;

import model.Employee;
import model.EmployeeGateway;
import usecases.operations.datastructures.PayEmployeeRequest;

public class PayEmployeeUsecase implements UseCase<PayEmployeeRequest> {

	public void execute(PayEmployeeRequest payEmployeeRequest) {
		LocalDate date = payEmployeeRequest.getDate();
		List<Employee> employees = EmployeeGateway.getAllEmployees();
		for(Employee employee: employees){
			if(employee.getPayShedule().shouldPay(date)){
				int amount = employee.calculatePay();
				employee.pay(amount);
			}
		}
	
	
	}

}
