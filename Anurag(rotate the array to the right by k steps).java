lass Solution {
     public void reversebetwn(int a[],int l, int r)
    {
   while(l<r)
   {
       int temp=a[l];
       a[l]=a[r];
       a[r]=temp;
       l++;
       r--;
   }
}
   

    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(n==0)
        {
            return;
        }
    int d=k%n;
    reversebetwn(nums,0,n-1);
    reversebetwn(nums,0,d-1);
    reversebetwn(nums,d,n-1);
        
    }
}
