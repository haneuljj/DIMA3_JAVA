// file 입출력처리는 꼼꼼하게 예외처리
package Iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTest {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		String data = "abcdefghijklmn"; // 저장할 데이터
		
		try {
			fos = new FileOutputStream("target.txt");
			
			for(int i=0; i<data.length(); ++i)
				fos.write(data.charAt(i));
			System.out.println("저장완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) fos.close();
			} catch (IOException e){
				e.printStackTrace();
			}
		}
		
	}

}
