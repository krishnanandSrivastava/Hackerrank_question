import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean flag=true;
        for(int i=0,j=A.length()-1;i<=j;i++,j--){
            if(A.charAt(i)!=A.charAt(j))
            {
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        }
        else System.out.println("No");
        
    }
}



