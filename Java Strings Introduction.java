import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        int i=0;boolean flag=false;
        if(A.length()>B.length()){
            while(i<B.length())
            {
                if((int)B.charAt(i)<(int)A.charAt(i))
                {
                    flag=true;
                    break;
                }
                if((int)B.charAt(i)>(int)A.charAt(i))
                {
                    flag=false;
                    break;
                }
                i++;
            }
        }
        if(A.length()<B.length()){
            while(i<A.length())
            {
                if((int)B.charAt(i)<(int)A.charAt(i))
                {
                    flag=true;
                    break;
                }
                if((int)B.charAt(i)>(int)A.charAt(i))
                {
                    flag=false;
                    break;
                }
                i++;
            }
        }
        if(flag){
            System.out.println("Yes");
        }
        else System.out.println("No");
        
        String s =A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(s);
        
    }
}



