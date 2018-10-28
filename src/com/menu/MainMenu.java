package com.menu;

import java.util.Scanner;

public class MainMenu {
	public static int print() {
		System.out.println("             KFC             ");
		System.out.println("1.大鸡排                                          2.原味鸡");
		System.out.println("3.豆浆                                              4.奶茶 ");
		System.out.println("             套餐                                     ");
		System.out.println("5.全家桶                                          6.小食双人餐");
		System.out.println("7.优惠食品");
		System.out.println("          优惠食品才能享有                   ");
		System.out.println("    满一百减十元，满二百减三十元               ");
		System.out.print("选择序号:");
		Scanner sc = new Scanner(System.in);
		int  i = sc.nextInt();
		while( i<1 || i > 6) {
			i = sc.nextInt();
		}
		return i;
	}
}
