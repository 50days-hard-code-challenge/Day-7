# this function assign null to the duplicate values and return the new length of the array
def removeDuplicates(arr,n):
    # Write your code here.
    count=0
    for i in range(n-1):
        if(arr[i]==arr[i+1]):
            arr[i]=None
            count+=1
        
    return (n-count)
