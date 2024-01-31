// switch 문과 lambda 연산
public class SwitchTest03 {

	public static void main(String[] args) {
		String yoil = "화";
		
		switch(yoil) {
		case "월", "수", "금" -> System.out.println("요가");  // ->(lambda연산), break문 없어도 출력 후 switch문 빠져나감
		case "화", "목", "토" -> System.out.println("수영");
		default -> System.out.println("달리기");
		}
		
		// switch 식 ! , java 12버전 이상
		String yoil2 = "월";
		
		String result = switch(yoil2) {
		case "월", "수", "금" -> "요가";  // 람다 뒤에 값은 식만 넣을 수 있음 문장 넣을 수 없음
		case "화", "목", "토" -> "수영";
		default -> "달리기";
		
		};
		System.out.println(yoil2 + "요일 운동: " + result);
 
	}

}
