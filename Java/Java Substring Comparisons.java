

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        
        
        for(int j=0;j<s.length();j++){
            for(int i=j;i<=s.length()-k;i+=k)
        {
            String temp =s.substring(i,i+k);
            //System.out.println(temp);
            for(int p=0;p<k;p++)
            {
                if(temp.charAt(p)>largest.charAt(p)){
                    largest=temp;
                    break;
                }
                if(temp.charAt(p)<largest.charAt(p)){
                    break;
                }
            }
            for(int p=0;p<k;p++)
            {
                if(temp.charAt(p)<smallest.charAt(p)){
                    smallest=temp;
                    break;
                }
                if(temp.charAt(p)>smallest.charAt(p)){
                    break;
                }
            }
        }              
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

