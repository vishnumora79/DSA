arr = [20,34,567,23,45,20,34]



dict = {}

for i in arr:
    dict[i] = dict.get(i,0) + 1

maxi = max(dict.values())

# print(dict)

arr1 = []

for i,j in dict.items():
    # print(j)
    if(j == maxi):
         arr1.append(i)
      
# print(maxi)    
# print(arr1)
print(min(arr1))