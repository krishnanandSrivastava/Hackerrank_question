# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import *
s,n=input().split()
n=int(n)
s=list(s)
li=list(permutations(s,n))
wordList=[''.join(word) for word in li]
wordList.sort()
for w in wordList:
    print(w)
