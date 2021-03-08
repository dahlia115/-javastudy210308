package day_19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Info implements Serializable {
	private int sNum;
	private String sName;
	private int kN;
	private int eN;
	private int mN;
	private String rank;

	public int getsNum() {
		return sNum;
	}

	public void setsNum(int sNum) {
		this.sNum = sNum;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getkN() {
		return kN;
	}

	public void setkN(int kN) {
		this.kN = kN;
	}

	public int geteN() {
		return eN;
	}

	public void seteN(int eN) {
		this.eN = eN;
	}

	public int getmN() {
		return mN;
	}

	public void setmN(int mN) {
		this.mN = mN;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
}

public class Quiz02 implements Serializable {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Info i = new Info();
		int num = 0, sN = 0;
		while (true) {
			System.out.println("1.학생 검색");
			System.out.println("2.등록");
			System.out.println("3.종료");
			System.out.print(">>> : ");
			num = sc.nextInt();
			switch (num) {
			case 1:

				System.out.print("학번 입력 : ");
				sN = sc.nextInt();
				File path = new File("C:\\LJW\\test\\" + sN);
				if (path.createNewFile() == false) {
					FileInputStream fis = new FileInputStream(path);
					BufferedInputStream bis = new BufferedInputStream(fis);
					ObjectInputStream ois = new ObjectInputStream(bis);	
					Info info = (Info) ois.readObject();
					System.out.println("학번 : " + info.getsNum());
					System.out.println("이름 : " + info.getsName());
					System.out.println("국어 : " + info.getkN());
					System.out.println("영어 : " + info.geteN());
					System.out.println("수학 : " + info.getmN());
					System.out.println("등급 : " + info.getRank());
					ois.close();
					bis.close();
					fis.close();
				} 
				break;
			case 2:

				System.out.print("학번 : ");
				i.setsNum(sc.nextInt());
				File path1 = new File("C:\\LJW\\test\\" + i.getsNum());
				if (path1.createNewFile()) {
					System.out.print("이름 : ");
					i.setsName(sc.next());
					System.out.print("국어 : ");
					i.setkN(sc.nextInt());
					System.out.print("영어 : ");
					i.seteN(sc.nextInt());
					System.out.print("수학 : ");
					i.setmN(sc.nextInt());
					System.out.print("등급 : ");
					i.setRank(sc.next());

					FileOutputStream fos = new FileOutputStream(path1);
					BufferedOutputStream bos = new BufferedOutputStream(fos);
					ObjectOutputStream oos = new ObjectOutputStream(bos);
					oos.writeObject(i);
					oos.close();
					bos.close();
					fos.close();
				} else {
					System.out.println("이미 존재하는 학번입니다.");
				}
				break;
			case 3:
				System.exit(0);
				break;
			}
		}
	}
}
