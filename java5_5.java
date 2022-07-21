package java_220721;

public class java5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		float average = 0f;
		
		int[]score = {100,88,100,100,90};
		
		for (int i=0; i<score.length; i++) {
			sum+=score[i]; // 반복문을 이용해서 있는 값을 다 더한다.
		}
		average = sum / (float)score.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		
	}

}
