package day_19;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String name=null, addr=null, age=null;	
 		File path = new File("C:\\LJW\\test\\abcd1234\\test.txt");
 		FileOutputStream fos = new FileOutputStream(path);
 		System.out.print("당신의 이름 : ");
		name = sc.next();	
		System.out.print("당신의 나이 : ");
		addr = sc.next();
		System.out.print("당신의 주소 : ");
		age = sc.next();
		
		name+="\n"+age+"\n"+addr;
		
		fos.write(name.getBytes());
		//fos.write(age.getBytes());
		//fos.write(addr.getBytes());
	}
}

