package day13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Stream3 {
	public static void main(String[] args) {
		MyFileIO fio = new MyFileIO();
		fio.readText("C:\\java\\test.txt");
		
	}
}

class MyFileIO{
	// 파일에 내용 입력하기(OutputStream)
	public void putText(String file) {
		FileOutputStream fout = null;
		Scanner sc = new Scanner(System.in);
		try {
			fout = new FileOutputStream(file, true);
			System.out.println("입력할 내용>>");
			String msg = sc.nextLine()+"\n";
			// 파일은 '바이트'단위로 적기 때문에 문자열을 바이트로 바꿔줘야함
			byte[] byteArray = msg.getBytes();
			fout.write(byteArray);
			
			System.out.println("입력 완료");			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("입력 실패...");
		}finally {
			try {
				fout.close();
				sc.close();
			} 
			catch (Exception e) {e.printStackTrace();}
		}		
	}
	
	// 파일 읽어오기(InputStream)
	public void readText(String file) {
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream(file);	// 파일을 불러온다
			
			// UTF-8로 변환한다.
			InputStreamReader isr = new InputStreamReader(fin, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			String msg = null;
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 읽기 실패...");
		}
		finally {
			try {fin.close();} 
			catch (Exception e) {e.printStackTrace();}
		}
	}
}