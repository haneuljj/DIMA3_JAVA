// 알파벳 삼각형 오른쪽으로 출력하기
public class Exam_21 {

	public static void main(String[] args) {
		
		for(int i=(int)'A'; i<=(int)'Z'; ++i) { 
			
			for(int s=(int)'Z'; s>i; --s)
				System.out.print((char)' ');
			
			for(int j=(int)'A'; j<=i; ++j)
				System.out.print((char)j);
			
			System.out.println();
		}

	// <답>
//		for(char ch='A'; ch<='Z'; ++ch) {
//			for(char c='Z'; c>=ch; --c)
//				System.out.println(' ');
//			
//			for(char c='A'; c<=ch; ++c)
//				System.out.println(c);
//		System.out.println();
//		}
	}

}
