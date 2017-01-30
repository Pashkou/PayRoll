package usecases.unionmembership;

import model.interfaces.UnionMembership;

public class SetUnionMembershipUsecase {
	public UnionMembership getUnionMembership(SetUnionMembeshipRequest setUnionMembershipRequest){
		if(setUnionMembershipRequest != null)
			return new Member();
		return new NonMember();
	}
}
