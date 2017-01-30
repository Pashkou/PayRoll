package usecases.operations;

import model.interfaces.PayDisposition;

public class AddHourlyEmployeeRequest extends AddEmployeeRequest {

	public AddHourlyEmployeeRequest(PayDisposition payDispositon) {
		super(payDispositon, false);
	}

}
