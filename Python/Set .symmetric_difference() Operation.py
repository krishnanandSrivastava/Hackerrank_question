# Enter your code here. Read input from STDIN. Print output to STDOUT
_=input()
e=set(input().split())
_=input()
f=set(input().split())
print(len(e.symmetric_difference(f)))
