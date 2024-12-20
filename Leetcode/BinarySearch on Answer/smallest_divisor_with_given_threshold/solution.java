// Problem: Smallest Divisor given a threshold (https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/)
// Language: Java
// Time Complexity : O(NLog(Max(Nums)))

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        return findDivisor(nums,threshold);
    }
    boolean possible(int mid,int[] arr,int threshold){
        int sum=0;
        for(int i=0;i<arr.length;i++){ 
            sum+=Math.ceil(((float)arr[i]/(float)mid));
        }
        if(sum<=threshold){
            return true;
        }
        else return false;
    }
    int findDivisor(int[] arr,int threshold){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int mid;
    int low=1;
    int high=max;
    while(low<=high){
        mid=(low+high)/2;
        if(possible(mid,arr,threshold)){
            high=mid-1;
        }else{
            low=mid+1;
        }
    }
    return low;
    }
}
