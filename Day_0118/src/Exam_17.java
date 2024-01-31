//[ 문제 ] for문을 이용해서 0~127까지에 해당하는 문자를 출력하시오
//<실행 예> 한 줄에 5개씩 출력
//0:__ 1:__ 2:__ 3:__ 4:__
//5:__ 6:__ ...
public class Exam_17 {

	public static void main(String[] args) {
			for(char i = 0; i <= 127; ++i){
				System.out.printf("%d: %c  ", (int)i, i);
				
				if((i+1)%5 == 0) System.out.println(); // 5개씩 출력하고 줄바꿈, 5의 배수마다 줄바꿈! i+1!
					
		}
	}

}

//Escape Sequence(문자): \n(10), \t, \r(13)(carriage return - 현재위치에서 맨 앞으로, Home키), \a, \f,, 자바의 엔터는 \r\n
// A(65), a(97), space bar(32)
// 'A'(65) + ' '(32) ==> 'a'(97)
// 'a + ' ' ==> 'A'A'