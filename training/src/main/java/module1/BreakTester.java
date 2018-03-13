package module1;

public class BreakTester {
	public static void main(String[] args){
		int i = 1;
		
		for(i = 1; i <= 10; i++){
			System.out.println(i);
			if(i == 5){
				break;
			}
		}
		System.out.println("Value of i outside the loop: " + i);
	}
}

