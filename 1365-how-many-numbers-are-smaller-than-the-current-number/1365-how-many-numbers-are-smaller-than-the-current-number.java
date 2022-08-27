class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int b[]=new int[nums.length];
        for(int i=0;i<n;i++ ){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
        }
            b[i]=count;
        }
        return b;
    }
}