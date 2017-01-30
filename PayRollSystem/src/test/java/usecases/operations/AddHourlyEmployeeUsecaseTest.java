package usecases.operations;

import org.junit.Test;

import model.interfaces.PayDisposition;
import usecases.operations.datastructures.AddHourlyEmployeeRequest;
import usecases.policy.paydisposition.DirectDeposit;
import usecases.unionmembership.SetUnionMembeshipRequest;

public class AddHourlyEmployeeUsecaseTest {

	@Test
	public void createHourlyEmployee(){
		PayDisposition payDisposition = new DirectDeposit();
		SetUnionMembeshipRequest setUnionMembeshipRequest = new SetUnionMembeshipRequest();
		
		
		AddHourlyEmployeeRequest addHourlyEmployeeRequest = new AddHourlyEmployeeRequest(payDisposition, setUnionMembeshipRequest, "", "");
		
		AddHourlyEmployeeUsecase addHourlyEmployeeUsecase = new AddHourlyEmployeeUsecase(addHourlyEmployeeRequest);
		
		addHourlyEmployeeUsecase.execute();
	}

}
