class Solution {
    public int removeElement(int[] nums, int val) {
//         int counter = 0, i = 0, j = nums.length-1;
//         for(int n : nums){
//             if(n == val){
//                 counter++;
//             }
//         }
//         while(i < j){
//             if(nums[i] == val){
//                 if(nums[j] != val){
//                     nums[i] = nums[i] + nums[j];
//                     nums[j] = nums[i] - nums[j];
//                     nums[i] = nums[i] - nums[j];
//                     i++;
//                     j--;
//                 }
//                 else{
//                     j--;
//                 }
//             }
//             else{
//                 i++;
//             }
//             System.out.println(Arrays.toString(nums));
//         }
            
//         return nums.length - counter;
        //Optimized solution
         int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
