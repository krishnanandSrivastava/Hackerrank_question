from collections import defaultdict
d = defaultdict(list)
n,m=input().split()
n=int(n)
m=int(m)
B=[]
for i in range(n):
    d[input()].append(i+1)
for i in range(m):
    B.append(input())

for i in B:
    if i in d.keys():
        print(*d[i])
    else:print('-1')
    
