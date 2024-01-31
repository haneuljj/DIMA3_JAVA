// 1 ~ 100까지의 자연수 중에서 3과 5의 배수만 출력
// 반드시 continue를 사용
public class ForTest03 {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; ++i) {
			// &가 논리연산으로 쓰일 때는 short circit을 하지 않음
			if (!((i % 3 == 0) & (i % 5 == 0))) continue;
			
			System.out.print(i + " ");
		}
	}

}
