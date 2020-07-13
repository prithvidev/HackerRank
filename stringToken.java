import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        str=str.trim();
        if(str.length() == 0){
            System.out.println(0);
            return;            
        }
        String[] words = str.split("[^a-zA-Z]+");
        System.out.println(words.length);
        for(String word:words){
            System.out.println(word);
        }
    }
}

