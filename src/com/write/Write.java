package com.write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Write {
	private Write(String s) {
		f = new File("./1.txt");
		try {
			fileout = new FileOutputStream(f);
			
			fileout.write(s.getBytes("utf-8"));
			fileout.flush();
			fileout.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	private FileOutputStream fileout;
	private File f;
	public static Write getInstance(String s) {
		s =operate(s);
		return new Write( s );
	}
	public static String operate(String s) {
		String []names =s.split(" ");
		StringBuffer str= new StringBuffer();
		str.append("������Ѷ�:"+names[0]+"\t");
		str.append("����ۿ���:"+names[1]+"\t");
		str.append("����:"+names[2]);
		return str.toString();
	}
}

