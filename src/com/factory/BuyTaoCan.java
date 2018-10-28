package com.factory;

import com.factory.entity.*;

public class BuyTaoCan {
	absFactory mFactory;
	public static int type;
	public BuyTaoCan(absFactory mFactory ) {
		setFactory(mFactory);
	}
	public void setFactory(absFactory m) {
		TaoCan taoCan= null;
		mFactory = m;
		int i = getType();
		taoCan = mFactory.createTaoCan(i);
		if( taoCan != null ) {
			taoCan.set();
			taoCan.print();
		}
	}
	public int getType(){
		return type;
	}
	public void setType(int i) {
		type = i;
	}
}
