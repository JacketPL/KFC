package com.menu;

import java.util.Scanner;

public class MainMenu {
	public static int print() {
		System.out.println("             KFC             ");
		System.out.println("1.����                                          2.ԭζ��");
		System.out.println("3.����                                              4.�̲� ");
		System.out.println("             �ײ�                                     ");
		System.out.println("5.ȫ��Ͱ                                          6.Сʳ˫�˲�");
		System.out.println("7.�Ż�ʳƷ");
		System.out.println("          �Ż�ʳƷ��������                   ");
		System.out.println("    ��һ�ټ�ʮԪ�������ټ���ʮԪ               ");
		System.out.print("ѡ�����:");
		Scanner sc = new Scanner(System.in);
		int  i = sc.nextInt();
		while( i<1 || i > 6) {
			i = sc.nextInt();
		}
		return i;
	}
}
