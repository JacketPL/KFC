package com.activity;

public class OneHundredMinusTenBehavior implements ActivityPrice{
/*·½·¨*/
	@Override
	public float buy( float m) {
		// TODO Auto-generated method stub
		if ( m >= 100)
		return 10;
		return 0;
	}
	
}
