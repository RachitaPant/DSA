// Problem: Minimum Number of Days to Make m Bouquets (https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/)
// Language: Java

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) return -1;
        int ans=findMindays(bloomDay,m,k);
        return ans;
    }
    boolean isPossible(int[] arr,int mid,int m,int k){
        int count=0;
        int bouquet=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                count++;
            }else{
               
                bouquet+=count/k;
                 count=0;
            }
        }
         bouquet+=count/k;
        if(bouquet>=m){
            return true;
        }
        return false;

    }
    int findMindays(int[] arr,int m ,int k){
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
                min=Math.min(arr[i],min);
                max=Math.max(arr[i],max);
        }
        if(min==max){
            return min;
        }
        int low=min;
        int high=max;
        
        int mid;
        while(low<high){
            mid=(low+high)/2;
            if(isPossible(arr,mid,m,k)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;

    }
}
