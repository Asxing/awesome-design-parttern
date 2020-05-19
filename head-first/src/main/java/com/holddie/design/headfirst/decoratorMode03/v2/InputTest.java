package com.holddie.design.headfirst.decoratorMode03.v2;

import java.io.*;

public class InputTest {
	public static void main(String[] args) {
		//设定为当前文件夹
		int c;
		try {
			InputStream in = new LowerCaseInputStream(
					new BufferedInputStream(
							new FileInputStream("/Users/zeyangg/SynologyDrive/ww/design-parttern/head-first/src/main/java/com/holddie/design/headfirst/decoratorMode03/v2/test.txt")
					)
			);
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
