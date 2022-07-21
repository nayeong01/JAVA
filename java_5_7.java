package java_220721;

public class java_5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];
		
		for (int i=0; i<numArr.length; i++) {
			numArr[i] = i; // 배열에 0~9까지 넣는다.
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for (int i=0; i < 100; i++) {
			int n = (int)(Math.random()*10);//0~9까지 임의의 숫자 하나를 뽑는다.
			int tmp = numArr[0]; // 첫번째 수를 tmp변수로 지정해준다. 이 변수는 배열의 위치를 섞기 위해 임시로 값을 저장해두는 곳이라고 생각하면 된다.
								 // 물이 들은 컵에 우유를 넣으려면 먼저 물을 다른 곳에 옮겨놔야 빈 컵에 우유를 넣을 수 있는거랑 똑같다.
			numArr[0] = numArr[n]; // 임의의 배열요소를 첫번째 배열요소와 같게 만든다.
			numArr[n] = tmp; // 임의의 배열요소는 첫번째 배열요소와 같게 만든다.
		}
		for (int i=0; i<numArr.length; i++)
			System.out.print(numArr[i]);
	}

}
