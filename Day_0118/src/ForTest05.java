
public class ForTest05 {

	public static void main(String[] args) {
		for(int dan=2; dan<=9; ++dan) {
			for(int i=1; i<=9; ++i)
				System.out.printf("%d * %d = %2d%n", dan, i, (dan*i));
			System.out.println();
		}
	}

}
