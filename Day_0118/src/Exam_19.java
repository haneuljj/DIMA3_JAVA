/*[문제]
*****
****
***
**
*

*/

public class Exam_19 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; ++i) { // 5회 반복
			
			for(int j=5; j>i; --j) // 별 다섯개에서 하나씩 줄여나가며 출력
				System.out.print("*");
			
			System.out.println();
		}
			
// <답>
//		for(int i=5; i>=1; --i) {
//			for(int j=0; j<i; ++j) 
//				System.out.print("*");
//			System.out.println();
//		
//		}
	}

}
