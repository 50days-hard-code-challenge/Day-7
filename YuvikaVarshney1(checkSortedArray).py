# the following function return 1 if the array is sorted in non decreasing order else it return 0.
def isSorted(n: int,  a: [int]) -> int:
    # Write your code here.
    f=1
    for i in range(n-1):
        if(a[i]<=a[i+1]):
            continue
        else:
            f=0
            break
    return f
