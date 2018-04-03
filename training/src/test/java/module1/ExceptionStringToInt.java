package module1;

import java.util.*;

public class ExceptionStringToInt {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        int t;
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            t=Integer.parseInt(S);
            System.out.println(t);
        }catch(Exception e){
            System.out.println("Bad String");
        };
    }
}

//Read a string, , and print its integer value; if  cannot be converted to an integer, print Bad String.