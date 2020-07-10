
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;


public class three_digit_num_array {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,1,9};
        Arrays.sort(arr);
        int num=0;
        for(int i= arr.length -1; i>=0;i--){
            num = num*10 + arr[i];
        }
        System.out.println("Largest 3 Digit number:"+" "+num);
    }
}
