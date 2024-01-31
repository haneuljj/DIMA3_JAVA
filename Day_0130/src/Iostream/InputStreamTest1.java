// file 입출력처리는 꼼꼼하게 예외처리
package Iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("song.txt"); // file 가져오기
			while (true) {
				int ch = fis.read(); // file 읽기, 영어 문서, 문자 하나하나 읽을 때
				if (ch == -1) break; // 파일 끝에 도달하면 반복문 빠져나가기
				System.out.print((char)ch); // 문자로 출력
			}
			System.out.println("끝 ~ !");
			
		} catch (IOException e) {
			System.out.println("파일이 존재 하지 않거나 오픈할 수 없습니다.");
			e.printStackTrace();
		} finally {
			try {
				// fis.close(); // 파일은 예외 발생 여부와 관계 없이 파일을 닫아야함 - 앞에서 파일을 못찾아서 예외 - null로 가져와서 close도 실행 안될 수 있음
				if (fis != null) fis.close(); // null아닐 때만 close 하도록
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // end of finally
	}

}
