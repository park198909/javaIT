package day14;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URL3 {
	public static void main(String[] args) {
		InputStream is = null;		// 내 프로그램이 데이터를 가져올 때는 InputStream
		InputStreamReader isr = null;		// 문자열 형식이 안맞을 수 있어서 UTF-8로 변환
		BufferedReader br = null;			// 문자열로 바꾸기 위해 버퍼단위로 읽음
		URL url = null;					// HTTP통신
		String str = null;
		String myWord = null;
		
		
		// 특정 페이지에서 원하는 문자열만 가져와 출력하기
		try {
			url = new URL("https://www.navercorp.com/service/creators");		// HTTP통신 시작
			is = url.openStream();												// 데이터 가져오기			
			isr = new InputStreamReader(is, "UTF-8");							// UTF-8로 변환
			br = new BufferedReader(isr);										// 문자열을 버퍼단위로 가져오긴
			
			// 버퍼리더를 문자열로 변경 (한줄씩 줄바꾸면서)
			while((str = br.readLine()) != null) {								// br.readline() : 한줄씩 읽기
				// 내가 원하는 문자열을 찾는다.
				if(str.contains("네이버웹툰")) {
					//System.out.println(str);
					myWord = str.substring(str.indexOf("btn_link")+10, str.indexOf("</"));		// 파싱
				}
			}			
		} catch (Exception e) {e.printStackTrace();}
		
		System.out.println("추출한 단어: "+myWord);
	}
}
