package com.personal.designpatterns.prototype;

public class MemberShip implements Cloneable{

	private int memberId;
	private String meberName;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public String getMeberName() {
		return meberName;
	}

	public MemberShip(int memberId, String meberName) {
		super();
		this.memberId = memberId;
		this.meberName = meberName;
	}

	public void setMeberName(String meberName) {
		this.meberName = meberName;
	}
	
	@Override
	public String toString() {
		return "MemberShip [memberId=" + memberId + ", meberName=" + meberName + "]";
	}
}
