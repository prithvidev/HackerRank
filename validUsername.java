
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class username {
    public static final String regular = "^[aA-zZ]\\w{5,29}$";
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            String pr = sc.next();
            Pattern p = Pattern.compile(regular);
            Matcher m = p.matcher(pr);
            if(m.matches()){
                System.out.println("Valid");
            }
            else{System.out.println("Invalid");}
        }
}
