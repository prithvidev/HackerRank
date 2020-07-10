
public class reverseadd {
    
    public long reverse(long num){
        long rev_num = 0;
        while(num>0){
            rev_num = rev_num*10 + num%10;
            num = num/10;
        }
        return rev_num;
    }
    
    public boolean ispalindrome(long num){
        return(reverse(num) == num);
    }
    
    public void Revadd(long num){
        long rev_num = 0;
        while(num <= Long.MAX_VALUE){
            rev_num = reverse(num);
            num = num + rev_num;
            
            if(ispalindrome(num)){
                System.out.println(num);
            }
            else if(num > Long.MAX_VALUE){System.out.println("NOT Exist");}
        }
    }
    
    public static void main(String args[]){
        reverseadd a = new reverseadd();
        a.Revadd(195);
    }
}
