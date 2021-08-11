def merge_the_tools(string, k):
    # your code goes here
    u={}
    li=[string[i:i+k] for i in range(0,len(string),k)]
    if k==1:
        for i in li:
            print(i)
    else:
        for word in li:
            t={}
            for k in word:
                t[k]=None
            u["".join(t.keys())]=None
        for key in u.keys():
            print(key)
    

if __name__ == '__main__':
