import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=1&&n<=20000){
            ArrayList<int[]> al =new ArrayList<int[]>();
            for(int i=0;i<n;i++){
                int size=sc.nextInt();
                int ar[]=new int[size];
                for(int j=0;j<size;j++){
                    ar[j]=sc.nextInt();
                }
                al.add(ar);
            }
            int q=sc.nextInt();
            for(int i=0;i<q;i++){
                int x=sc.nextInt();
                int y=sc.nextInt();
                //System.out.println(x+" "+y);
                try{
                    int br[]=al.get(x-1);
                    System.out.println(br[y-1]);
                }
                catch(Exception e){
                    System.out.println("ERROR!");
                }
            }
        }
    }
}











