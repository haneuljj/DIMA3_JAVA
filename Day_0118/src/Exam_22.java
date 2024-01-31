
public class Exam_22 {

	public static void main(String[] args) {
		for(int n=2; n<=6; n +=4 ) { // 2~5단 출력과 6~9단 출력 -> 2번 반복 필요
			
			for(int i=1; i<=9; ++i)	{ // 줄마다 곱하는 값은 같지만 줄이 바뀌면서 곱하는 값 +1씩
				
				for(int dan=n; dan<=(n+3); ++dan) // 단의 숫자를 바꾸는 것이 줄마다 반복
					System.out.print(dan + " * " + i + " = " + (dan*i) + "\t");
				
				System.out.println();
			} // end second for
			System.out.println();
			
		} // end first for
			
	} // end main()

}
