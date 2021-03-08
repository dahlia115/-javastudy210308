package day_19;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//보조스트림
public class MainClass04 {
	public static void main(String[] args) throws Exception {
		File path = new File("C:\\LJW\\test\\aaa.txt");
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		for(char i ='0';i<='9';i++) {
			//Thread.sleep(1000);
			//fos.write(i);
			bos.write(i);
		}
		bos.flush();//해당하는 보조스트림을 비우다.
		bos.write('a');
		
		bos.close();
		fos.close();
	}
}
