arr = [0,-1,2,-3,1]

k = -2
n = len(arr)
def pair(arr,n):
    for i  in range(n-1):
        for j in range(i+1,n):
            if arr[i] + arr[j] == k:
               return True
               break
    return False
if(pair(arr,n) == True):
    print("Yes")
else:
    print("No")    