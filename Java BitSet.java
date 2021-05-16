import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<BitSet> bs=new ArrayList<BitSet>();
        BitSet b1=new BitSet(n);
        BitSet b2 =new BitSet(n);
        bs.add(b1);bs.add(b2);
        for(int i=0;i<m;i++){
            String s =sc.next();
            int s1=sc.nextInt();
            int s2 =sc.nextInt();
            switch(s.charAt(0)){
                case 'A':
                    bs.get(s1-1).and(bs.get(s2-1));
                    System.out.println(bs.get(0).cardinality()+" "+bs.get(1).cardinality());
                    break;
                case 'O':
                    bs.get(s1-1).or(bs.get(s2-1));
                    System.out.println(bs.get(0).cardinality()+" "+bs.get(1).cardinality());
                    break;
                case 'X':
                    bs.get(s1-1).xor(bs.get(s2-1));
                    System.out.println(bs.get(0).cardinality()+" "+bs.get(1).cardinality());
                    break;
                case 'F':
                    bs.get(s1-1).flip(s2);
                    System.out.println(bs.get(0).cardinality()+" "+bs.get(1).cardinality());
                    break;
                case 'S':
                    bs.get(s1-1).set(s2);
                    System.out.println(bs.get(0).cardinality()+" "+bs.get(1).cardinality());
                    break;
            }
        }
    }
}
