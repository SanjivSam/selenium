package module1;

public class ArrayTester {
	public static void main(String[] args){
		/* Different ways of creating 1-Dimensional array
		 * int[] array1 = new int[5]; //here all the array elements are intialized to zero
		 * int[] array2 = {10,20,30,40};
		 * length property of the array will give the size of the array - array1.length will give 5 and array2.length will give 4
		 */
		
		int[] array = {11,23,34,45,56};
		System.out.println("The length of the array is: " + array.length);
		for(int index = 0; index < array.length; index++){
			System.out.print(array[index] + "   ");
		}
		
		int oddCount = 0, evenCount = 0;
		for(int index = 0; index < array.length; index++){
			if( array[index] % 2 == 0){
				evenCount++;
			}else{
				oddCount++;
			}
		}
		System.out.println();
		System.out.println("Number of odd elements in the array: " + oddCount);
		System.out.println("Number of even elements int the array: " + evenCount);
	}
}
