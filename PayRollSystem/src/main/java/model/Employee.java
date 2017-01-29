package model;

import java.util.Date;

import model.interfaces.PayDisposition;
import model.interfaces.PaySchedule;
import model.interfaces.PayType;
import model.interfaces.UnionMembership;

public class Employee {
	private PayDisposition payDisposition;
	private PaySchedule paySchedule;
	private PayType payType;
	private UnionMembership unionMemebership;
	
	private String firstName;
	private String lastName;
	
	public Employee(PayDisposition payDisposition, PaySchedule paySchedule, PayType payType,
			UnionMembership unionMemebership, String firstName, String lastName) {
		super();
		this.payDisposition = payDisposition;
		this.paySchedule = paySchedule;
		this.payType = payType;
		this.unionMemebership = unionMemebership;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void pay(int amount){
		
	} 
	
	public int calculatePay(){
		return 0;
	}
	
	public int getDues(Date date){
		return 0;
	}
	
	public int getTotalCharges(Date date){
		return 0;
	}
	
	public PaySchedule getPayShedule(){
		return paySchedule;
	}
	
	
}
