from collections import Counter
x=int(input())
shoes=list(input().split())
shoes=list(map(int,shoes))
n=int(input())
customer=[]
for i in range(n):
    customer.append(list(map(int,input().split())))
d=dict(Counter(shoes))
keys=d.keys()
profit=0
# print(d)
for order in customer:
    size,price=zip(order)
    if size[0] in keys:
        remainingShoes=d[size[0]]
        if remainingShoes>0:
            profit+=price[0]
            d[size[0]]-=1
print(profit)
