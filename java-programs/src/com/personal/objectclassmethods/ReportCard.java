package com.personal.objectclassmethods;

public class ReportCard {
	private int mathScore;
	public ReportCard()
	{
		this.mathScore=(int)(Math.random()*101)+1;
	}
	@Override
	public String toString() {
		return ""+mathScore ;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
}
