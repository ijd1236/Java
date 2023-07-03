
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1부터 100까지 출력하시오

		
//		for (int i = 1; i < 101; i ++) {
//			System.out.println(i);
//		}
		// 1부터 100까지 값을 다 더하세요.
		int total = 0;
//		for (int i = 1; i < 101; i ++ ) {
//			total =total + i;	
//		}
//		System.out.println(total);
		
		// 1부터 100까지의 홀수만 다 더하시오.
		// 그 결과를 출력하세요.
		total = 0;
//		for (int i = 1 ; i <= 100; i++) {
//			if(i%2 == 1) {
//				total =total + i;
//			}
//		}
//		System.out.println(total);
		
		// while 반복문.
		int i = 1;
		while (i < 101) {
			System.out.println(i);
			i++; // i = i+1
		}
		
		total =0;
		i = 1;
		while (i<101) {
			total =total +i;
			i++;
		}
		System.out.println(total);
		
		while(true) {
			System.out.println("무한루프");
		}
				
	}

}
