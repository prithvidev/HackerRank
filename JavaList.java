import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>(n);
        for(int i=0; i<n ;i++){
            int value = sc.nextInt();
            list.add(value);
        }
        int q = sc.nextInt();
        for(int j=0; j<q; j++){
            String y = sc.next();
            if(y.equals("Insert")){
                int t = sc.nextInt();
                int value1 = sc.nextInt();
                list.add(t, value1);
            }
            else if(y.equals("Delete")){
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        for (int u : list) { 
            System.out.print(u + " "); 
            } 
    }
}