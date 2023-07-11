public class TowerOfHanoi4 {
    public static void tower(String a,String b,String c,int n){
        if(n==1){
            System.out.println("Move disc "+n+" from "+a+" to "+c);
            return;
        }
        tower(a,c,b,n-1);
        System.out.println("Move disc "+n+" from "+a+" to "+c);
        tower(b,a,c,n-1);
    }
    public static void main(String[] args) {
        tower("A","B","C",3);
        // number of steps to put the disc= 2^n-1
        
    }
    
}