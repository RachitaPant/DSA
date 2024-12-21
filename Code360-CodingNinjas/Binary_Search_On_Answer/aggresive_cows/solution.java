//problem : aggresive cows LINK(https://www.naukri.com/code360/problems/aggressive-cows_1082559)
//Time Complexity:O(nlogn)
//Space Complexity:O(1)
import java.util.Arrays;
public class Solution {
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        return check(stalls,k);
    }

    static boolean canWePlace(int[] stalls,int cows,int mid){
        int count=1;
        int last=stalls[0];
        for(int i=1;i<stalls.length;i++)
        {int difference=stalls[i]-last;
            if(mid<=difference){
                count++;
                last=stalls[i];
            }
if(count>=cows) return true;
        }
        
        return false;
    }
     static int check(int[] stalls,int cows){
        Arrays.sort(stalls);
        int low=0;
        int high=stalls[stalls.length-1]-stalls[0];
        
        int mid;
      
        while (low <= high) {
             mid = (low + high) / 2;
            boolean flag = canWePlace(stalls,cows, mid);

            if (flag) {
                low = mid+1; 
            } else {
                high=mid-1; 
            }
        }

        return high;

    }
}
