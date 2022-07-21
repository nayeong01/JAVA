package java_220721;

public class java5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {79,88,91,33,100,55,95};
		
		int max = score[0];
		int min = score[0];
		// 상대적인 최댓값 최솟값을 구해주기 위해 배열의 첫번째 79를 일단 변수로 설정해준다.
		
		for(int i=1; i<score.length; i++) {
			if(score[i]>max) { // 그 다음 for문으로 배열 요소들을 돌리면서 79보다 크면 max, min변수값을 변경해주는 조건문을 만든다.
				max = score[i]; 
			}else if (score[i]<min) {
				min = score[i];
			}
		}
		
		System.out.println("최대값 :"+max);
		System.out.println("최소값 :"+min);
		
	}

}
