from math import gcd
n = 20
k = 7
arr = [4, 3, 86, 5, 27, 82, 78, 98, 25, 90, 26, 90, 55, 62, 96, 66, 82, 77, 6, 82]

count = 0
sublists = []
for i in range(n):
    for j in range(i+1,n+1):
        sublists.append(arr[i:j])
print(sublists) 
print("number of sulists:",len(sublists))                
for sub in sublists:
    result = sub[0]
    for i in range(1, len(sub)):
        result = gcd(result, sub[i])
    if result <= k:
        count += 1

print(count)        