import java.util.Scanner;

import com.activity.ConText;
import com.activity.One;
import com.activity.Two;
import com.activity.Zero;
import com.factory.Store;
import com.menu.MainMenu;
import com.write.Write;

public class Main {
	static public float money=100;
	static public float accMoney=0;
	public static void main(String[] args) {
		
		int i = MainMenu.print();
		money = getMoney(i);
		accMoney = getActivity();

		Scanner sc = new Scanner(System.in);
		Store store = null;
		if( i>= 5 && i <=6 )
			store = new Store(i);
			
		System.out.println("需支付:"+money+" 折扣金额:"+accMoney);
		float j = sc.nextFloat();
		float y = j -money -accMoney;
		System.out.println("顾客支付金额:"+j+"找零:"+(y));
		Write write = Write.getInstance(money+" "+accMoney+" "+y);
	}
	
	
	//活动
	public static float getActivity() {
		float m = 0;
		ConText text =null;
		if( money >= 100)
			text = new ConText(new One());
		else if( money >= 300 )
			text = new ConText(new Two());
		else
			text = new ConText(new Zero());
		m =  text.call();
		return m;
	}
	public static float getMoney(int m) {
		float f;
		switch(m) {
		case 1: f =12;
			break;
		case 2: f = 21;
			break;
		case 3: f = 3;
			break;
		case 4: f = 8;
			break;
		case 5: f = 168;
			break;
		case 6: f = 19;
			break;
		default: f= 0;		
		}
		return f;
	}
	
}
