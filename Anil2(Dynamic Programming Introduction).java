import java.util.Scanner;

public class Solution {

    public static int fibM(int n){
		// create a array of all the unique call
		int[] storage = new int[n+1];

		// intially we put -1 at all postion of array
		for(int i = 0; i<=n; i++){
			storage[i] = -1;
		}
		return  helper(n,storage);
	}

	public static int helper(int n, int[] storage){
		// modify the base case 
		if(n==0 || n==1){
			storage[n] = n;
			return storage[n];
		}
		if(storage[n]!=-1){
			return storage[n];
		}
		// recursive call 
		storage[n] = helper(n-1,storage) + helper(n-2, storage);
		return storage[n];
		
	}
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(fibM(n));

		
	}

}
