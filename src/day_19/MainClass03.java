package day_19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainClass03 {
	public static void main(String[] args) throws Exception {
		File path = new File("C:\\LJW\\test\\abcd1234\\test.txt");
		FileInputStream fis = new FileInputStream(path);// 인풋스트림

		/*
		byte[] readData = new byte[1024];
		fis.read(readData);
		System.out.println(readData.toString());
		for (int i = 0; readData[i] != 0; i++) {
			System.out.println((char)readData[i]);
		}
		*/
		while(true) {
			int res = fis.read();
			if(res == -1) break;
			System.out.println(res);
		}
	}
}
