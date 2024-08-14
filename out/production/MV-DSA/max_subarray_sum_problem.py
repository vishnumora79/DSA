mylist = [1,0,1,0]
max_sum = float('-inf')
max_subarray = []
n = len(mylist)
for i in range(n):
    for j in range(i+1,n+1):
        subarray = mylist[i:j]
        current_sum = sum(subarray)
        if(current_sum > max_sum):
             max_sum = current_sum
             max_subarray = subarray

print(max_sum)
print(max_subarray)



