a = [3,34,4,12,5,2]

n = len(a)

given_sum = 9
subsets = []
for i  in range(n):
    for j in range(i+1,n):
        subsets.append(a[i:j])
print(subsets)        
for i in subsets:
    if sum(i) == given_sum:
        print(i)