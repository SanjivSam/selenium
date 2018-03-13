package module1;
public class NestedIfElseTester {

	
	public static void main(String[] args) {
		
		int num1,num2,num3;
		
		num1=100;
		num2=200;
		num3=300;
		
		
		if(num1 > num2 )
		{
			if(num1>num3)
			{
				System.out.println("Num1 is greatest");
			}
			else
			{
				System.out.println("Num3 is greatest");
			}
		}
		else
		{
			if(num2 > num3)
			{
				System.out.println("Num2 is greatest");
			}
			else
			{
				System.out.println("Num3 is greatest");
			}
			
		}
		
			
		
		
	}

}
