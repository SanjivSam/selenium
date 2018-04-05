package module1;

import java.util.*;

class teleDirSrch{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            myMap.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(myMap.containsKey(s))
                System.out.println(s+"="+myMap.get(s));
            else
                System.out.println("Not found");
        }
        in.close();
    }
}

/*
 * Sample Input
 * 
 * 3 sam 99912222 tom 11122222 harry 12299933 
 * sam edward harry
 */
