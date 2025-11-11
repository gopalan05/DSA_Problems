class Solution {
    public int findMin(int[] nums) {

        int l=nums.length;
        int i=0;
        int j=l-1;
        int min=nums[0];
        while(i<=j){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[j]<min){
                min=nums[j];
            }
            i++;
            j--;
        }
        return min;
    }
}