package com.dbc.bank;

import java.util.ArrayList;

public class DBString {
	static String s="abc2axyz3mn5k2";
	static Integer index=0;
	static Integer n;
	static StringBuffer sb=null;
	static String copy2="";
	static ArrayList ar=new ArrayList();

	public DBString() {
		sb=new StringBuffer();
	}

	public static void main(String[] args) {
		String copy="";
		//static String s="abc2axyz3mn5k2";
		StringBuffer sb=new StringBuffer();
		System.out.println(sb);
		Integer element=0;
		for(int i=0;i<s.length();i++) {
			ar.add(s.charAt(i));
			
		}
		for (int i=0;i<ar.size();i++) {
			try {
			element=Integer.parseInt(String.valueOf(ar.get(i)));
			System.out.println("element="+element);
			
			} catch(Exception ex) {
				
				if(element==0) {
				copy=copy+String.valueOf(ar.get(i));
				System.out.println("Exception occured::"+ex);
				} 	
			}
			for (int j=0;j<element;j++) {
				sb.append(copy);
			}

			if(element>0) {
				element=0;
				copy="";
			}
			
		}
		System.out.println(sb);
	}

}
