package com.gdut.ch04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class TestFileException {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream in = null;
		
		try {
			in = new FileInputStream("E:/Workspaces/新建文本文档.txt");
			int b;
			b = in.read();
			while (b != -1) {
				System.out.print((char)b);
				b = in.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
