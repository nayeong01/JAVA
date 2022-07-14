
public class java6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Card.width = "+ Card.width);
		System.out.println("Card.height = "+ Card.heigth);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + "," + c1.number+"이며, 크기는 (" + c1.width + ", "+c1.heigth + ")" );
		System.out.println("c2은 " + c2.kind + "," + c2.number+"이며, 크기는 (" + c2.width + ", "+c2.heigth + ")" );
		
		c1.width = 50;
		c1.heigth = 80;
		
		System.out.println("c1은 " + c1.kind + "," + c1.number+"이며, 크기는 (" + c1.width + ", "+c1.heigth + ")" );
		System.out.println("c2은 " + c2.kind + "," + c2.number+"이며, 크기는 (" + c2.width + ", "+c2.heigth + ")" );		
		
	}

}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int heigth = 250;
}