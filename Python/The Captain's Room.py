# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import groupby
k=int(input())
grp=list(map(int,input().split()))
grp.sort()
g=groupby(grp)
d={len(list(group)):k for k,group in g}
print(d[1])
