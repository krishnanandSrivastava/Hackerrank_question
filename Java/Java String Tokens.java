import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if(s.trim().isEmpty()) {
        System.out.println(0);
    }
    else {
        System.out.println(s.trim().split("[!,?. @_']+").length);
        for(String a : s.trim().split("[!,?. @_']+")){
            System.out.println(a);
            }
        }
        scan.close();
    }
}

