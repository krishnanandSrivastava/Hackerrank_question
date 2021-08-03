    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            HashSet<Integer> hs =new HashSet();
            int n = in.nextInt();
            int m = in.nextInt();int max=Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
               if(i<m){
                   deque.add(num);
                   hs.add(num);
                   if(i==m-1)max=Math.max(max,hs.size());
               }
               else{
                   int p=deque.pop();
                   deque.addLast(num);
                   if(deque.contains(p)==false)
                   hs.remove(p);
                   hs.add(num);
                   max=Math.max(max,hs.size());
               }
               
            }
            System.out.println(max);
        }
    }



