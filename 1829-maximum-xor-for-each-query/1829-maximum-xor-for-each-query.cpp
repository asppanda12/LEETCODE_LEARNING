class Solution {
public:
    vector<int> getMaximumXor(vector<int>& nums, int maximumBit) {
        int j,i,temp,mx;
        int n=nums.size();
        vector<int> res(n,0);
        
        int xo=0;
        for(int i=0;i<n;i++)
        {
            res[n-i-1]=xo^nums[i];
            xo^=nums[i];
        }
        for(i=0;i<res.size();i++){
            int temp=res[i]^((1<<maximumBit)-1);
            res[i]=temp;
            }
            return res;
    }
};