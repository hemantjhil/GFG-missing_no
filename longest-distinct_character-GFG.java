import java.io.*;
import java.util.*;
import java.lang.*;
class GFG{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int t=0;t<n;t++){
      String s=sc.next();
      int max=0;
      HashSet<Character> h1=new HashSet<>();
      int i=0,j=0;
      while(j<s.length()){
        if(!h1.contains(s.charAt(j))){
          h1.add(s.charAt(j);
          j++;
          max=Math.max(max,j-i);
          }
        else{
          h1.remove(charAt(i));
          i++;
          }
          }
       System.out.println(max);
       }
   }
}
