package day_19;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
//역직렬화
public class MainClass08 {
	public static void main(String[] args) throws Exception {
		File path = new File("C:\\LJW\\test\\aaa.txt");
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		TestMember m = (TestMember) ois.readObject();
		System.out.println(m);
		
		ois.close();
		bis.close();
		fis.close();
	}
}
