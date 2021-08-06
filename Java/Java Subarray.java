import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();int q=0;
        if(n>=1&n<=100){
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            
            for(int i=1;i<=n;i++){
                int c[];
                for(int j=0;j<n;j++){
                    int sum=0;
                    if(i+j<=n){
                        c=Arrays.copyOfRange(a,j,j+i);
                    
                        for(int d:c){
                            sum+=d;
                            //System.out.print(d+" ");
                    }}
                    //System.out.println();
                    if(sum<0){
                        q++;
                    }
                }
            }
            System.out.println(q);
        }
    }
}
