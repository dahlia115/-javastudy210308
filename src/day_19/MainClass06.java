package day_19;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
//직렬화
public class MainClass06 {
	public static void main(String[] args) throws Exception {
		File path = new File("C:\\LJW\\test\\aaa.txt");
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		String s = dis.readUTF();
		int i = dis.readInt();
		double d = dis.readDouble();
		
		System.out.println(s+i+d);
		
		dis.close();
		bis.close();
		fis.close();
	}
}
