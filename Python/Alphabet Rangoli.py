def print_rangoli(size):
    forward=[]
    for i in range(size):
        forward.append(chr(97+i))
    backward=list(forward)
    backward.reverse()
    forward.pop(0)
    if len(backward)>1:
        for i in range(size-1,-1,-1):
            l="-".join(backward[:len(backward)-i])
            r="-".join(forward[i:])
            print(l.rjust(size*2-1,'-'),end='')
            print("-"+r.ljust(size*2-3,'-'))
        for i in range(size):
            if i==0:
                continue
            l="-".join(backward[:len(backward)-i])
            r="-".join(forward[i:])
            print(l.rjust(size*2-1,'-'),end='')
            print("-"+r.ljust(size*2-3,'-'))
    else:
        print(backward.pop())
if __name__ == '__main__':
