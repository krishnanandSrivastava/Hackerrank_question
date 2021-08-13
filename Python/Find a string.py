def count_substring(string, sub_string):
    c=0
    l=len(sub_string)
    for i in range(len(string)-l+1):
        
        if sub_string == string[i:l+i]:
            c+=1
    return c

if __name__ == '__main__':
