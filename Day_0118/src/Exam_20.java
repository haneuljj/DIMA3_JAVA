/*[문제]
 * A
 * AB
 * ABC
 * ...
 * ABCDEFGHIJKLMNOPQRSTUWYZ
 */

public class Exam_20 {
	public static void main(String[] args) {
		
		for(int i=(int)'A'; i<=(int)'Z'; ++i) { // A~Z까지 한번씩 증가시키며 반복
			
			for(int j=(int)'A'; j<(i+1); ++j) //
				System.out.print((char)j); // 바깥 반복문의 횟수가 하나씩 증가되면서 알파벳 출력개수 하나씩 증가
			
			System.out.println();
		}

// <답>
//		for(char ch='A'; ch<='Z'; ++ch) {
//			for(char c='A'; c<=ch; ++c)
//				System.out.println(c);
//			System.out.println();
//		}
	}
}
