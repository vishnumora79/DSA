n = int(input())

def n_wt_loop(n):
    if n > 0:    
         n_wt_loop(n-1)
         print(n)
n_wt_loop(n)   
