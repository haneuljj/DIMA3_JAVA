// String 배열 
public class ArrayTest3 {

	public static void main(String[] args) {
		// String 배열 생성  
		String[] sary1 = new String[]{"봄", "여름", "가을", "겨울"}; 
		String[] sary2 = {"봄", "여름", "가을", "겨울"};
		String[] sary3 = {
				new String("봄"), 
				new String("여름"), 
				new String("가을"), 
				new String("겨울")
		};
		
		System.out.print(sary1 + " ");
		System.out.println();
		
		System.out.print(sary2 + " ");
		System.out.println();
		
		System.out.print(sary3 + " ");
		System.out.println();
		
		for (int i = 0; i < sary1.length; i++) System.out.print(sary1[i] + " ");

	}

}