a = [0,3,1,5,5,8]
b = [6,4,2,9,7,8]

b1 = [(b[i],i) for i in range(len(b))]
b1.sort()
print(b1)
sorted_a = [a[index] for _,index in b1]
print(sorted_a)
a1 = [x for x,_ in b1]
print(a1)
result = []
for i in range(len(a1)-1):
    j = i
    if(a1[j] <= sorted_a[i+1]):
        result.append(j)

print(result)        
    
