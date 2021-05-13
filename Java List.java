import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        List<Integer> l =new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            if(sc.next().compareTo("Delete")==0){
                l.remove(sc.nextInt());
            }
            else{
                l.add(sc.nextInt(),sc.nextInt());
            }
        }
        for(int i:l){
            System.out.print(i+" ");
        }
    }
}
