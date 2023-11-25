import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
         Scanner sc = new Scanner (System.in);
         long K = sc.nextLong();
         long ans = -1;
         for(long x=0; x<=Math.sqrt(K);x++){
             long curr = (x*x)+(3*x);
             if(curr==K){
                 ans=x;
                 break;

             }
         }
         System.out.println(ans);
    }
}