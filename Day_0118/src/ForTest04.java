
public class ForTest04 {

	public static void main(String[] args) {
		
		for (int i=0; i<5; ++i) {
			for(int j=0; j<(i+1); ++j) // 안쪽의 for문은 바깥 for문의 값을 받아 쓸 수 있음
				System.out.print("*"); //문장1
			System.out.println(); //문장2
	}
	}
}

//*****
//*****
//*****
//*****
//*****

//*
//**
//***
//****
//*****