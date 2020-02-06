/*

https://www.geeksforgeeks.org/sum-products-possible-subsets/
Time Complexity: 0(N)
Space Complexity: 0(1)

Algorithm:
-  subset sum of {a,b,c} = (1+a)(1+b)(1+c)-1

*/

class Solution{
    public int subsetSum(int[] nums){
        int ans = 1;
        for(int i=0;i<nums.length;++i){
            ans = ans*(nums[i]+1);
        }

        return ans-1;

    }
}