package java_220721;

public class java5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]ball = new int[45];
		
		for(int i=0;i<ball.length;i++)
			ball[i]=i+1;
		
		int temp = 0; // 두 값을 바꾸는데 사용할 임시변수
		int j =0; // 임의의 값을 얻어서 저장할 변수
		
		for(int i=0; i<6; i++) {
			j=(int)(Math.random()*45);
			temp = ball[i]; // ball[i]를 temp에 저장한다.
			ball[i]=ball[j]; // ball[i]와 ball[j]를 같게 한다.
			ball[j]=temp; // ball[j]와 temp를 같게 한다. 즉, ball[i]와 같게 한다.
			// 이건 1~45까지 있는 배열의 위치를 램덤하게 섞는 코드이다.
		}
		for(int i=0; i<6; i++)
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		// 섞은 배열에서 1부터 6번째 요소를 출력한다. 그러면 랜덤으로 임의의 숫자 6개가 출력된다.

	}

}
