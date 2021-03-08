package day_19;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String stNum = null;
		System.out.println("등록 학번 입력");
		stNum = sc.next();
 		File path = new File("C:\\LJW\\test\\"+stNum+".txt");
		//System.out.println("create new file : "+path.createNewFile());//참거짓
		if(path.createNewFile()) {
			System.out.println("성공");
			String name = null;
			System.out.println("등록 이름");
			name = sc.next();
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(name.getBytes());
			System.out.println("등록 되었습니다");
		}else {
			System.out.println("존재하는 학번입니다");
		}
		System.out.println("file path : "+ path.getPath());
	}
}
