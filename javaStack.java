import java.util.*;
class Solution{
	static boolean isBalanced(String s) {
        Stack<Character> s1 = new Stack<>();

        for(int i=0; i< s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                s1.push(s.charAt(i));
            }
            else{
                if(s1.isEmpty()){
                    return false;
                }
                else{
                    char q = s1.pop();
                    if(s.charAt(i)==')' && q!='('){
                        return false;
                    }
                    else if(s.charAt(i)==']' && q!='['){
                        return false;
                    }
                    else if(s.charAt(i)=='}' && q!='{'){
                        return false;
                    }
                }
            }
        }
        if(s1.isEmpty()){
                return true;
            }
            else{
                return false;
            }
    }
     private static final Scanner scanner = new Scanner(System.in);
	public static void main(String []argh)
	{       while(scanner.hasNext()){
            String s = scanner.nextLine();
            boolean result = isBalanced(s);
            System.out.println(result);
        }
    }
		
	}




