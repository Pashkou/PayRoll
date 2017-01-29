package usecases.unionmembership;

import java.util.List;

import model.interfaces.UnionMembership;

public class Member implements UnionMembership {
	private List<ServiceCharge> serviceCharges;
}
