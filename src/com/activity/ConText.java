package com.activity;

public class ConText {
	private ActivityPrice act;
	public ConText(ActivityPrice one) {
		this.act = one;
	}
	public float call() {
		return act.buy();
	}
}
