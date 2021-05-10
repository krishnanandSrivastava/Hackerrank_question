import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    long n=sc.nextLong();
	    long sum=n*(n+1)/2;//Math.pow(2,Long.toBinaryString(n).length())
	    long powerof2=Long.parseLong(Long.toBinaryString(n).replaceAll("0","1"),2);
		System.out.println(sum-powerof2-powerof2);
}
}
