package usecases.operations.datastructures;

import model.interfaces.PayDisposition;
import usecases.operations.AddHourlyEmployeeUsecase;
import usecases.operations.controller.RequestBuilder;
import usecases.policy.paydisposition.DirectDeposit;
import usecases.unionmembership.SetUnionMembeshipRequest;

public class RequestBuilderImpl implements RequestBuilder {

	public AddHourlyEmployeeRequest buildAddHourlyEmployee() {
		PayDisposition payDisposition = new DirectDeposit();
		SetUnionMembeshipRequest setUnionMembeshipRequest = new SetUnionMembeshipRequest();
		return new AddHourlyEmployeeRequest(payDisposition, setUnionMembeshipRequest);
	}

	public AddHourlyEmployeeUsecase makeAddHourlyEmployee() {
		return new AddHourlyEmployeeUsecase();
	}

}
