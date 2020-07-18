//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            hash.put(name,phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            try{
                int y = hash.get(s);
                System.out.println(s+"="+y);
            }catch(Exception e){
                System.out.println("Not found");
            }

		}
	}
}



