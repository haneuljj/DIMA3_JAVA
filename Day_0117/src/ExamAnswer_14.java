import java.util.Scanner;

public class ExamAnswer_14 {
	
	public static void main(String[] args) {
		double height = 0.0;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(count < 5) {
			System.out.print("키는: ");
			height = scanner.nextDouble();
			
			/*
			 if (!(height < 150 || height > 180)) ++count;
			 */
			
			if(height >= 150 && height <= 180) ++count;
			System.out.println(count + "명 탑승\n");
		}
		System.out.println("열차 출발합니다.");
		scanner.close();
		
	}
}
