//problem Intersection Of Two Sorted Arrays LINK(https://www.naukri.com/code360/problems/intersection-of-2-arrays_1082149)
// Time Complexity - O(n+m) Space Complexity- O(n+m)

import java.util.* ;
import java.io.*; 
public class Solution
{
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		// Write Your Code Here.
		int i=0;
		int j=0;
		ArrayList<Integer> ans=new ArrayList<Integer>();

		while(i<arr1.size()&&j<arr2.size()){

				if(arr2.get(j)>arr1.get(i)){
					i++;

				}else if(arr1.get(i)>arr2.get(j)){
					j++;
				}else{
					ans.add(arr1.get(i));
					i++;
					j++;

				}
				
		}

		return ans;
	}
}
