package usecases.policy.paydisposition;

import model.interfaces.PayDisposition;

public class DirectDeposit implements PayDisposition {

	public void transfer() {
		System.out.println("DirectDeposit: transfer");
	}
	
}
