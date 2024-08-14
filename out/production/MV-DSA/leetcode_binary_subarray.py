nums = [1,0,1,0]
n = len(nums)
##### - This code is to find all possible subarrays whose length is greater than 1
# for i in range(n):
#     for j in range(i+2,n+1):
#         print(nums[i:j])
#####

# count = 0
# def alternate(arr):
#     n1 = len(arr)
#     for i in range(n1-1):
#         if(arr[i] == arr[i+1]):
#             return False
#     return True    
# for i in range(n):
#     for j in range(i+1,n+1):
#         subarray = nums[i:j]
#         if(len(subarray) == 1):
#             count += 1
#         else:
#             if(alternate(subarray) == True):
#                 count += 1
# print(count)
                    