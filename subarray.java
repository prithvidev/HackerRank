import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        //subarray
        int asum = 0;
        for(int j = 0;j<n;j++){
            for(int k=j; k<n ;k++){
                int curr_sum = 0;
                for(int i=j; i<=k ; i++){
                    curr_sum+= arr[i];
                }
                if(curr_sum < 0){
                    asum++;
                }
            }
        }
        System.out.println(asum);
    }
}   