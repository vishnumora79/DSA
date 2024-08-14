
nums = [-1,10,6,7,-7,1]

n = len(nums)

nums.sort(reverse = True)


print(nums)
def largest_positive_with_negitive(nums,n):
    first = 0
    last = n - 1
    while(first < last):
         if(nums[first] == -nums[last]):
           return nums[first]
         elif nums[first] > -nums[last]:
             first += 1
         elif nums[first] < -nums[last]:
             last -= 1    

    return -1

result = largest_positive_with_negitive(nums,n)

print(result)
