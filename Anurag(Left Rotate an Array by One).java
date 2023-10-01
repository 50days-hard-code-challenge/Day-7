import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int ans[]=new int[n];
        for(int i=1;i<n;i++)
        {
            ans[i-1]=arr[i];
        }
        ans[n-1]=arr[0];
        return ans;

    }
}
