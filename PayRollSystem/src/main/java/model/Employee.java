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
	
	private Employee(Builder builder) {
		this.payDisposition = builder.payDisposition;
		this.paySchedule = builder.paySchedule;
		this.payType = builder.payType;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
	}
	
	public static class Builder{
		private PayDisposition payDisposition;
		private PaySchedule paySchedule;
		private PayType payType;
		private String firstName;
		private String lastName;
		
		public Builder(String fistName, String lastName){
			this.firstName = fistName;
			this.lastName = lastName;
		}
		
		public Employee build(){
			return new Employee(this);
		}
	
		public Builder payDisposition(PayDisposition payDisposition){
			this.payDisposition = payDisposition;
			return this;
		}
		
		public Builder paySchedule(PaySchedule paySchedule){
			this.paySchedule = paySchedule;
			return this;
		}
		
		public Builder payType(PayType payType){
			this.payType = payType;
			return this;
		}
		
		public Builder firstName(String firstName){
			this.firstName = firstName;
			return this;
		}
		
		public Builder lastName(String lastName){
			this.lastName = lastName;
			return this;
		}
	
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
	
	public void setUnionMemebership(UnionMembership unionMemebership) {
		this.unionMemebership = unionMemebership;
	}
	
	public PayType getPayType() {
		return payType;
	}
	
}
