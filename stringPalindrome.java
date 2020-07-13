
import java.util.Scanner;


public class stringReverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sd = new StringBuilder();
        sd.append(str);
        String input = sd.reverse().toString();
        if(input.equals(str)){
            System.out.println("Yes");
        }
        else{System.out.println("no");}
    }
}
