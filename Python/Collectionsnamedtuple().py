from collections import namedtuple
n=int(input())
ncol=input().split()
stu=namedtuple('stu',ncol)
studetails=[]
for i in range(n):
    inp=input().split()
    studetails.append(stu(*inp))
marks=list(map(int,[student.MARKS for student in studetails ]))
print(sum(marks)/len(marks))
