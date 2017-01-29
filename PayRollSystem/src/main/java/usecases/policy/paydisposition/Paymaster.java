package usecases.policy.paydisposition;

import model.interfaces.PayDisposition;

public class Paymaster implements PayDisposition {

	public void transfer() {
		System.out.println("Paymaster: transfer");
	}

}
