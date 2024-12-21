// Problem : Move zeroes to the end LINK:(https://leetcode.com/problems/move-zeroes/description/)
//Intuition
//Brute: We can use a temp array and store the non-zero values there , fill the original array with zero and then fill the non-zero order wise from the other array.It takes O(n) extra space and time complexity will be O(n+n+n)=O(n)
//Optimal : Using only O(1) extra space lets solve using two pointer , finding where the zero lies and swapping with non-zero terms.

//Approach
//Here we run a loop for i -> length of the array.
//if we encounter a non-zero number increment i and j,
//but if we found a zero lets only increment i. So j now lies where a zero is when the next non-zero element is encountered we swap them . initially we were swapping the same elements with themselves as i==j initially till we got a zero after that j tracked the zeroes.

///Complexity
//Time complexity:
//O(n)

//Space complexity:
//O(1)

class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;int j=0;
        while(i<nums.length){
            
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
                
            }else{
                i++;
            }
        }
    }
}
