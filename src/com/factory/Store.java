package com.factory;

public class Store {
	public Store(int i) {
		BuyTaoCan.type = i;
		BuyTaoCan buy = new BuyTaoCan(new TCFactory());
	}
}
