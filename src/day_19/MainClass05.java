package day_19;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainClass05 {
	public static void main(String[] args) throws Exception {
		File path = new File("C:\\LJW\\test\\aaa.txt");
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeUTF("김개똥");
		dos.writeInt(1000);
		dos.writeDouble(1.2345);
		
		dos.close();
		bos.close();
		fos.close();
	}
}
