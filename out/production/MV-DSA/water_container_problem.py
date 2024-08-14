mylist = [1,5,4,3]
mylist1 = sorted(mylist)
n = len(mylist)
k = mylist1[n - 3]
maxi = max(mylist)
l = abs(mylist[maxi] - mylist[k])

print(l*k)