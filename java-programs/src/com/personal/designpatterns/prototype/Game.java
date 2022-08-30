package com.personal.designpatterns.prototype;

public class Game implements Cloneable {

	private int id;
	private String name;
	private MemberShip memberShip;

	public Game clone() throws CloneNotSupportedException {
		Game game =  (Game) super.clone();
		game.setMemberShip((MemberShip) memberShip.clone());
		return game;
	}

	public MemberShip getMemberShip() {
		return memberShip;
	}

	public void setMemberShip(MemberShip memberShip) {
		this.memberShip = memberShip;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", memberShip=" + memberShip + "]";
	}
}
