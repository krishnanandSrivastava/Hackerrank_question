if __name__ == '__main__':
    s = input()
    flag=False
    for sb in s:
        if sb.isalnum():
            print("True")
            flag=True
            break
    if flag==False:
        print("False")
    flag=False
    for sb in s:
        if sb.isalpha():
            print("True")
            flag=True
            break
    if flag==False:
        print("False")
    flag=False
    for sb in s:
        if sb.isdigit():
            print("True")
            flag=True
            break
    if flag==False:
        print("False")
    flag=False
    for sb in s:
        if sb.islower():
            print("True")
            flag=True
            break
    if flag==False:
        print("False")
    flag=False
    for sb in s:
        if sb.isupper():
            print("True")
            flag=True
            break
    if flag==False:
        print("False")
    flag=False
