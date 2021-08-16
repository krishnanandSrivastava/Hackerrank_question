# Enter your code here. Read input from STDIN. Print output to STDOUT
_=input()
a=set(input().split())
n=int(input())
for i in range(n):
    cmd =input().split()
    if cmd[0]=='intersection_update':
        val=set(input().split())
        a.intersection_update(val)
    elif cmd[0]=='update':
        val=set(input().split())
        a.update(val)
    elif cmd[0]=='symmetric_difference_update':
        val=set(input().split())
        a.symmetric_difference_update(val)
    elif cmd[0]=='difference_update':
        val=set(input().split())
        a.difference_update(val)
print(sum(list(map(int,a))))
