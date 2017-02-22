#include <stdio.h>
#define MOD 1000000007
int main() {
	int t;
	scanf("%d",&t);
	for(int i=0;i<t;i++){
	    long long int n;
	    scanf("%d",&n);
	    long long dp[n+1];
	    dp[1]=2;
	    dp[2]=3;
	    for(long long int i=3;i<=n;i++){
	        dp[i]=((dp[i-1]%MOD)+(dp[i-2]%MOD))%MOD;
	    }
	    printf("%lld\n",dp[n]%MOD);
	}
	return 0;
}