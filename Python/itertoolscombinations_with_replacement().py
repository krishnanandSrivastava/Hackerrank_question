# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import *
s,n=input().split()
n=int(n)
s=list(s)
s.sort()
comb=list(combinations_with_replacement(s,n))
wordList=[''.join(li) for li in comb]
wordList.sort()
# print(wordList)
for w in wordList:
    print(w)
