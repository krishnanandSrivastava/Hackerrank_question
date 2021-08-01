

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();b=b.toLowerCase();
        char p[]=a.toCharArray();
        char q[]=b.toCharArray();
        p=sort(p);q=sort(q);
        boolean flag=true;
        if(a.length()==b.length())
        {
            for(int i=0;i<p.length;i++)
            if(p[i]!=q[i]){
                flag=false;
                break;
            }
        }
        else return false;
        return flag;
    }
static char[] sort(char s[]){
    for(int i=0;i<s.length;i++){
        for(int j=0;j<s.length;j++)
        {
            char temp;
            if(s[i]>s[j])
            {
                temp=s[i];
                s[i]=s[j];
                s[j]=temp;
            }
        }
    }
    return s;
} 
