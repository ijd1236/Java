
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열은, 데이터 여러개를 저장하는 것.
		// 자바의 가장 기본적인 데이터 스트럭쳐이다.
		// 하지만, 자바의 배열(Array)는 사용하기 귀찮다.
		// 따라서, 실무에서는 ArrayList 와 HashMap을 
		// 사용한다.
		// 학생들 50명의 수학점수를 처리하려 한다.
		int[] scoreArr = new int[50];  // 저장 공간 설정
		scoreArr[0]= 70;
		scoreArr[1] = 80;
		scoreArr[2] = 90;
		System.out.println(scoreArr[49]);
		// 조기 값은 전부 0임
		System.out.println(scoreArr[0]);
//		System.out.println(scoreArr[50]); // 저장공간을 넘어서면 에러가난다.
		
		// 학생 20명의 수학점수를 관리하려 합니다.matArr
		// 모든 학생의 점수를 30점으로 해서 만들어 주세요.
		
		int[] matArr = new int[20];
		for (int i =0; i<20; i++ ) {
			matArr[i] = 30;
		}
		
		System.out.println(matArr[0]);
		
		int[] mathArr2 = {30,30};
		
		System.out.println(mathArr2[1]);
		
		// mathArr 의 맨 마지막 학생의 점수를 출력하세요.
		System.out.println(matArr[19]);
		// matArr 의 맨 마지막 학생의 점수를 100점으로 수정하세요.
		matArr[19] = 100;
		
		// matArr 의 모든 학생의 점수를 다 출력해주세요.
		System.out.println();
		for (int i = 0; i<20; i++) {
			System.out.println(matArr[i]); 
		}
		
		System.out.println();
		
		// length를 파이썬의 len 대신 사용 가능
		for (int i = 0; i<matArr.length; i++) {
			System.out.println(matArr[i]); 
		}	
			
		// 70,99,45,64
		// 이 데이터를 배열로 만드세요.
		
		int[] arr = {70,99,45,64};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); 
		}
	}

}
