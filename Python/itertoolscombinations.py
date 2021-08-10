# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import *
s,n=input().split()
n=int(n)
s=list(s)
s.sort()
comb=[]
for i in range(1,n+1):
    r=list(combinations(s,i))
    r.sort()
    comb.append(r)
wordList=[''.join(tu) for li in comb for tu in li]
# print(comb)
# wordList.sort()
for w in wordList:
    print(w)
