# Method - 1

# t = int(input("Enter the T value:"))
# for i in range(t):
#     n = int(input("Enter the N value:"))
#     k = int(input("Enter the K value:"))
#     mylist = []
#     count = 1
#     for j in range(n):
#         x = int(input(f"Enter the {j+1} problem rating:"))
#         mylist.append(x)
#     mylist.sort()
#     for k1 in range(n-1):
#         if((mylist[k1+1] - mylist[k1]) == k):
#             pass
#         else:
#             count += 1
#     print(count)    

# Method - 2

t = int(input("Enter the T value:"))

for i in range(t):
    n,k = list(map(int,input().split()))
    mylist = []
    count = 1
    x = list(map(int,input().split()))
    mylist += x
    mylist.sort()
    for k1 in range(n-1):
        if((mylist[k1+1] - mylist[k1]) == k):
            pass
        else:
            count += 1
    print(count)        
