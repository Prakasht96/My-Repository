import java.util.*;
import java.io.*;


public class Consecutive{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		  for(int i=0; i<t; i++) {
		    int n = in.nextInt();
		    System.out.println(fib(n));
		}
	}
	
	public static int fib(int n) {
	    if(n ==1|| n == 2) {
	        return n+1;
	    }
	    int dp[] = new int[n+1];
	    dp[0] = 1;
	    dp[1] = 2;
	    for(int i=2; i<=n; i++) {
	        dp[i] = (dp[i-1]%(1000000007) + dp[i-2]%(1000000007))%(1000000007);
	    }
	    return dp[n]%(1000000007);
	}
	
}