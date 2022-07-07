class Solution {
public:
    
    int mod = 1e9 + 7;
    
    int n;
    
    vector<int> vis;
    
    int dp[202][202];
    
    long long func(int i,int j,string &s){
        if(i == n) return 1;
        if(dp[i][j] != -1) return dp[i][j];
        long long ans=0;
        if(s[i] == 'D'){
            
            for(int k=j-1;k>=0;k--){
                if(vis[k] == false){
                    vis[k] = true;
                    long long tmp = func(i+1,k,s);
                    ans += tmp;
                    ans%=mod;
                    vis[k] = false;
                }
            }
        }else{
            for(int k=j+1;k<=n;k++){
                if(vis[k] == false){
                    vis[k] = true;
                    long long tmp = func(i+1,k,s);
                    ans += tmp;
                    ans%=mod;
                    vis[k] = false;
                }
            }
        }
        
        return dp[i][j] = ans;
        
    }
    
    int numPermsDISequence(string s) {
        
        n = s.size();
        memset(dp,-1,sizeof(dp));
        
        vis = vector<int> (n+1,false);
        
        long long ans = 0;
        for(int i=0;i<=n;i++){
            vis[i] = true;
            long long tmp = func(0,i,s);
            ans += tmp;
            ans%=mod;
            vis[i] = false;
        }
        
        return ans;
        
    }
};