package com.activity;

public class TwoHundredMinusThrityBehavior implements ActivityPrice{
	public float buy(float m) {
		if( m >= 300 )
		return 30;
		return 0;
	}
}
