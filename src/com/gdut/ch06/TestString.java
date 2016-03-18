package com.gdut.ch06;

public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello java";
		String s2 = "hello";
		
//		s1 = new String("Hello");
		
		System.out.println(s1.charAt(1));
		
		
		String str = "aaaadjfkjdjg456484%%AADJJFDJIG;DAJ";
		int lCount = 0, uCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {
				lCount++;
			}else if (c >= 'A' && c <= 'Z') {
				uCount++;
			}
		}
		System.out.println(lCount);
		System.out.println(uCount);
	}

}
