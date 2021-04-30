
static int B,H;static boolean flag=false;
static {
    Scanner sc  =new Scanner (System.in);
    //int B,H;boolean flag=false;
    B=sc.nextInt();
    H=sc.nextInt();
    if(B>0&&H>0)
    flag=true;
    if(!flag)
    System.out.println("java.lang.Exception: Breadth and height must be positive");
}

