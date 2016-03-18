package com.gdut.ch06;

import java.io.File;

public class FileList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("E:/Ajax");
		tree(f, 0);
		
	}
	private static void tree(File f, int level){
		String preStr = "";
		for (int i = 0; i < level; i++) {
			preStr += "    ";
		}
		
		File[] childs = f.listFiles();
		for (int i = 0; i < childs.length; i++) {
			System.out.println(preStr + childs[i].getName());
			if (childs[i].isDirectory()) {		
				tree(childs[i], level++);
			}
		}
	}
}
