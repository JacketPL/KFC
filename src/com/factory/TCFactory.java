package com.factory;

import com.factory.entity.TaoCan;
import com.factory.entity.TaoCan1;
import com.factory.entity.TaoCan2;

public class TCFactory implements absFactory {

	 public TaoCan createTaoCan(int i) {
		// TODO Auto-generated method stub
		TaoCan taoCan = null;
		switch(i) {
			case 5: taoCan = new TaoCan1();
				break;
			case 6: taoCan = new TaoCan2();
				break;
			default: taoCan = null;
				break;
		}
		return taoCan;
	}



}
