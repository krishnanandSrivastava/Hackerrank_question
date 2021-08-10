from collections import OrderedDict
n=int(input())
orders=[]
for i in range(n):
    inp=input().split()
    price=inp[-1]
    inp.remove(price)
    price =int(price)
    inp=" ".join(inp)
    orders.append((inp,price))
keys=[key[0] for key in orders]
od=OrderedDict({key:0 for key in keys})
for order in orders:
    od[order[0]]+=order[1]
for i in od:
    print(i,od[i])
