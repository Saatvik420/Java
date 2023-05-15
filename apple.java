
class apple{
    static int minapples(int m, int k, int n, int s, int w, int e){
        if(m<=s*k)
            return m;
        else if(m<=s*k+e+w)
            return s*k+e+w;
        else 
            return -1;
    }
    public static void main(String[] args){
        int m=10;
        int k=15;
        int n=3;
        int s=0;
        int w=1;
        int e=0;
        int ans=minapples(m,k,n,s,w,e);
        System.out.println(ans);
    }
}
