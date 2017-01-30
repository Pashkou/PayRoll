package usecases.operations;

import org.junit.Test;

import model.interfaces.PayDisposition;
import usecases.operations.datastructures.AddCommissionedEmployeeRequest;
import usecases.operations.datastructures.AddHourlyEmployeeRequest;
import usecases.policy.paydisposition.DirectDeposit;
import usecases.unionmembership.SetUnionMembeshipRequest;

public class AddHourlyEmployeeUsecaseTest {

	@Test
	public void createHourlyEmployee(){
		PayDisposition payDisposition = new DirectDeposit();
		SetUnionMembeshipRequest setUnionMembeshipRequest = new SetUnionMembeshipRequest();
		AddHourlyEmployeeRequest addHourlyEmployeeRequest = new AddHourlyEmployeeRequest(payDisposition, setUnionMembeshipRequest, "Siarhei", "Pashkou");
		AddHourlyEmployeeUsecase addHourlyEmployeeUsecase = new AddHourlyEmployeeUsecase(addHourlyEmployeeRequest);
		addHourlyEmployeeUsecase.execute();
	}

	@Test
	public void createCommisionedEmployee(){
		PayDisposition payDisposition = new DirectDeposit();
		SetUnionMembeshipRequest setUnionMembeshipRequest = new SetUnionMembeshipRequest();
		AddCommissionedEmployeeRequest addCommissionedEmployeeRequest = new AddCommissionedEmployeeRequest(payDisposition, setUnionMembeshipRequest, "Siarhei", "Pashkou");
		AddCommissionedEmployeeUsecase addCommissionedEmployeeUsecase = new AddCommissionedEmployeeUsecase(addCommissionedEmployeeRequest);
		addCommissionedEmployeeUsecase.execute();
	}

}
