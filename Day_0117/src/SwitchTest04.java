// switch문과 yield문, jdk13이상부터
public class SwitchTest04 {

	public static void main(String[] args) {
		String yoil = "Mon";
		double calories = 0;
		
		calories = switch(yoil) {
		case "Mon", "Wed", "Fri":
			System.out.println(yoil + " exercise: 에어로빅");
		    yield 664.5; // yield 뒤의 값은 변수(calories)에 들어감
		case "Tue", "Thr", "Sat":
			System.out.println(yoil + " exercise: 수영");
			yield 528;
		default:
			System.out.println(yoil + " exercise: 달리기");
			yield 1200;
		};
		System.out.println("Calories: " + calories + "kcal");
	}

}
