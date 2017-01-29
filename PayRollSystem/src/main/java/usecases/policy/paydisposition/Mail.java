package usecases.policy.paydisposition;

import model.interfaces.PayDisposition;

public class Mail implements PayDisposition {

	public void transfer() {
		System.out.println("Mail: transfer");
	}

}
