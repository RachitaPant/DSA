// problem: Union of Two Sorted Arrays with Duplicate Elements Link(https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/0)
// time Complexity O(n+m) Space Complexity O(n+m) n: length of array 1 and m: length of array 2
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        int i=0;
        int j=0;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        while(i<a.length&&j<b.length){
            if(a[i]<=b[j]){
                if(arr.size()==0||arr.get(arr.size()-1)!=a[i]){
                     arr.add(a[i]);
                    
                }
                i++;
            }
            else{
                 if(arr.size()==0||arr.get(arr.size()-1)!=b[j]){
                     arr.add(b[j]);
                    
                }
                j++;
            }
        }
        while(i<a.length){
            if(arr.size()==0||arr.get(arr.size()-1)!=a[i]){
                     arr.add(a[i]);
                    
                }
                i++;
            
        }
        while(j<b.length){
            if(arr.size()==0||arr.get(arr.size()-1)!=b[j]){
                     arr.add(b[j]);
                    
                }
                j++;
            
        }
        return arr;
        
    }
}
