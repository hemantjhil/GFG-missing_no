/*package whatever //do not write package name here */
/*Given a string, the task is to remove duplicates from it. Expected time complexity O(n) where n is length of input string and extra space O(1) under the assumption that there are total 256 possible characters in a string.*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		sc.nextLine();
		for(int w=0;w<q;w++){
		    String s=sc.nextLine();
		    //s=s.replaceAll(" ","");
		    //System.out.println(s+" "+w);
		    char[] c=s.toCharArray();
		    HashSet<Character> h=new HashSet<>();
		    //char[] c1=new char[s.length()];
		    //int t=0;
		    /*for(int i=0;i<s.length();i++){
		        if(c[i]!=' '){
		            c1[t++]=c[i];
		            
		        }
		    }*/
		    for(int i=0;i<s.length();i++){
		        if(!h.contains(c[i])){
		            System.out.print(c[i]);
		            h.add(c[i]);
		        }
		        //}
		    }
		    System.out.println();
		}
	}
}
