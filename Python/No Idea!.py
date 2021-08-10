from itertools import groupby
n,m=input().split()
arr=list(map(int,input().split()))
A=set(list(map(int,input().split())))
B=set(list(map(int,input().split())))
arr.sort()
a=groupby(arr)
a={key:len(list(group)) for key,group in a}
h=0
sarr=set(arr)
for i in sarr.intersection(A):
    h+=a[i]
for i in sarr.intersection(B):
    h-=a[i]
print(h)
