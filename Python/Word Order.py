from collections import OrderedDict
n=int(input())
keys=[]
for i in range(n):
    keys.append(input())
od={key:0 for key in keys}
for key in keys:
    od[key]+=1
print(len(od))
occ=[od[i]  for i in od]
print(*occ)
