# KFC
```
package com.activity;

public class Zero implements ActivityPrice{
	public float buy() {
		return 0;
	}
}
package com.activity;

public class One implements ActivityPrice {
	public float buy(   ) {
			return 10;
	}
}
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
package com.activity;

public interface ActivityPrice {
	 float buy();
}
/*策略模式*/
```
#  图片
1.
![img](https://github.com/JacketPL/KFC/blob/master/img/1.PNG)

2.
![img1](https://github.com/JacketPL/KFC/blob/master/img/2.PNG)

3.
![img2](https://github.com/JacketPL/KFC/blob/master/img/factory.png)

4.
![img3](https://github.com/JacketPL/KFC/blob/master/img/plan.png)


5.
![img4](https://github.com/JacketPL/KFC/blob/master/img/single.png)

