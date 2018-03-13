package module1;

public class ReturnTester {

	
	public int addition(int num1,int num2)
	{
		int result;
		result=num1+num2;
		return result;
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		int num1,num2,add;
		num1=10;
		num2=20;
		ReturnTester t=new ReturnTester();
		
		add=t.addition(num1, num2);
		
		System.out.println("Addition of "+ num1 +" and "+ num2 +" is "+ add);
				
	}

}

