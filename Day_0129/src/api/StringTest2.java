package api;

public class StringTest2 {

	public static void main(String[] args) {
		String str = "무궁화 꽃이 피었습니다!"; // String - sequence data, 각 문자가 인덱스가 있음
		
		// charAt(int index) : 문자열에서 위치값을 주면 문자 하나 반환
		char ch = str.charAt(4); 
		System.out.println(ch);
		
		// codePointAt(int index) : 문자열에서 위치값을 주면 문자의 코드값 반환
		int code = str.codePointAt(3);
		System.out.println(code);
		
		// compareTo(String another String) : 인덱스가 같은 값끼리 비교해서 코드값을 빼서 차이값구하기, 다른값이 나올때까지
		// 같다 / 다르다 외에 앞에값이 큰지(양수) / 뒤의 값이 큰지(음수) / 같은지 비교 가능
		// equals()는 같다 / 다르다의 여부만 확인
		int diff = "Korea".compareTo("korea");
		System.out.println(diff); // -32
		int diff2 = "Korea".compareTo("Korea!");
		System.out.println(diff2); // 0 - ! 값; -1
		
		// concat(String str) : +
		String temp = "월드".concat("컵");
		System.out.println(temp);
		
		// contains(CharSequence s) : 문자열에 받은 다른 문자열이 포함되는지 여부
		boolean result = str.contains(".");
		System.out.println(result);
		
		// endsWith(String suffix) : 특정 문자열로 끝나는지 여부
		result = str.endsWith("다!");
		System.out.println(result);
		
		// startsWith(String prefix) : 특정 문자열로 시작하는지 여부
		result = str.endsWith("장미");
		System.out.println(result);
		
		// indexOf(int ch) : 어떤 특정 문자의 위치값 (숫자로 변환할 수 있는 문자)를 매개변수로
		int index = str.indexOf('꽃');
		System.out.println(index);
		
		int index2 = str.indexOf('강'); // 문자열에 없는 문자를 입력받을 시 -> -1
		System.out.println(index2);
		
		// isEmpty() : 문자열이 비어있는지 여부, 전체 문자열의 길이가 0일 때 true
		result = "".isEmpty();
		System.out.println(result);
		
		// isBlank() : 화이트 스페이스만 있는 경우도 true
		result = " ".isBlank();
		System.out.println(result);
		
		// trim() : 앞 뒤 공백을 잘라내기
		result = "19911225 ".trim().isEmpty();
		System.out.println("19911225 ".length()); // 9
		System.out.println("19911225 ".trim().length()); // 8
		System.out.println(result); // false
		
		// substring(int beginIndex)
		// substring(int beginIndex, int endIndex)
		String carNum = "111허2222";
		String front = carNum.substring(0, 3);
		String back = carNum.substring(4);
		System.out.println(front);
		System.out.println(back);
//		
//		System.out.println(isNumeric("111"));
//		System.out.println(isNumeric("1a1"));
		
		if(!(isNumeric(front)||isNumeric(back))) {
			System.out.println("올바른 자동차 번호가 아닙니다");
		} else {
			System.out.println("올바른 자동차 번호입니다.");
		}
		
		// static String format(String format, Object... args)
		String name = "저팔계";
		double m = 42.195;
		double time = 12.45;
		
		String d = String.format("%s선수는 마라톤 %f구간을 %8.3f시간이 걸렸다.", name, m, time);
		System.out.println(d);
		
		// String[]split(String regex)
		String student = "전우치 100 98 88";
		String[] jumsu = student.split(" ");
		
		String n = jumsu[0];
		int kor = Integer.parseInt(jumsu[1]); // 문자를 숫자로 변경
		int eng = Integer.parseInt(jumsu[2]);
		int mat = Integer.parseInt(jumsu[3]);
		
		int total = kor + eng + mat;
		double avg = total / 3.0;
		
		System.out.printf("이름: %s, 국어: %d점, 영어: %d점, 수학: %d점, 총점: %d점, 평균: %.2f점\n", n, kor, eng, mat, total, avg);
		
		System.out.println((int)('0'));
	}
	
	// 올바른 차 번호인지 확인하는 메서드, 숫자로만 구성되어있으면 true, 아니면 false
	public static boolean isNumeric(String temp) {
		boolean result = true;
		for (int i=0; i<temp.length(); ++i) {
			char ch = temp.charAt(i);
			if (ch < '0' || ch >'9') {
				result = false;
				break;
			} // end of if
		} // end of for
		return result;
	}
}
