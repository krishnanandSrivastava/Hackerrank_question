import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String s=sc.next();
            //Complete the code
            Stack<Character> st =new Stack();
            if(s.length()%2==0&&s.isEmpty()==false){
                boolean flag=true;
                for(int i=0;i<s.length();i++){
                    char ci=s.charAt(i);
                    if(ci=='{'||ci=='('||ci=='['){
                        st.push(ci);
                    }else{
                        if(st.empty()){
                            flag=false;break;
                        }else{
                            char p=st.pop();
                        if(ci=='}'&&p=='{'||ci==']'&&p=='['||ci==')'&&p=='('){
                            continue;
                        }
                        else{
                            flag=false;break;
                        }
                        }
                    }
                }
                if(flag){
                    System.out.println("true");
                }else System.out.println("false");
            }else{
                System.out.println("false");
            }
		}
		
	}
}



