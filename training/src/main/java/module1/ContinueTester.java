package module1;

public class ContinueTester {
	public static void main(String[] args){
		int i;
		for(i = 1; i <= 5; i++){
			if( i == 3){
				continue;
			}
			System.out.println(i);
		}
	}
}

