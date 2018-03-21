package module1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HourGlassArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        HourGlass(arr);
    }

	private static  void HourGlass(int[][] arr) {
		int sum[] = new int[16];
	    int h = 0;
	    for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 4; j++) {
	            sum[h] = arr[i][j] + arr[i][j+1] + arr[i][j+2]
	                    + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1]
	                    + arr[i+2][j+2];
	            h++;
	        }
	    }
	    Arrays.sort(sum);
	    System.out.println(sum[15]);
	}
}


/*Given a  2D Array, :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g*/
