// file 입출력처리는 꼼꼼하게 예외처리
package Iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("망곰이.jpg");
			fos = new FileOutputStream("target.jpg");
			
			while (true) {
				int ch = fis.read();
				if (ch == -1) break; // 파일 끝에 도달하면 반복문 빠져나가기
				fos.write(ch);
			}
			System.out.println("복사완료 ~ !");
			
		} catch (IOException e) {
			System.out.println("파일이 존재 하지 않거나 오픈할 수 없습니다.");
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) fis.close();
				if (fos != null) fos.close(); // 쓰는 것의 close가 중요, target파일이 깨질 수 있음
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // end of finally
	}

}
