package day_19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//파일 입출력
class MainClass01 {
	public static void main(String[] args) throws Exception {
		File path = new File("C:\\LJW\\test\\aaa.txt");//경로지정
		//String sPath = "C:\\LJW\\test\\bbb.txt";
		FileOutputStream fos = new FileOutputStream(path);//아웃풋스트림
		//path.mkdir();
		
		String str = "test file";
		
		fos.write(97);
		fos.write('A');//바이트
		fos.write(str.getBytes());//바이트로 변환
	}
}
