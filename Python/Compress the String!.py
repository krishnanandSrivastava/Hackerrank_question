from itertools import *
s=list(map(int,input()))
li=[(len(list(g)),k) for k,g in groupby(s)]
print(*li) 
