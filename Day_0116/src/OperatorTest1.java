
public class OperatorTest1 {

	public static void main(String[] args) {
		int a = 7;
		String data;
		
		data = (a % 2 == 0) ? "짝수" : "홀수"; // 삼항연산자, (조건) ? (조건참일때반환값) : (조건거짓일때반환값)
		System.out.println(data);
		
		a = 0;
		data = (a > 0) ? "양수" : (a < 0) ? "음수" : "영"; // 삼항연산자 중첩
		System.out.println(data);
	}

}
