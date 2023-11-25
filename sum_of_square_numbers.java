import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        long c = sc.nextLong();
        long left = 0;
        long right = (long) Math.sqrt(c);
        String ans="No";
        while(left <= right){
            long sum = left*left + right*right;

            if(sum == c){
                ans = "Yes";
                break;
            }else if(sum < c){
                left++;
            }else{
                right--;
            }
            
        }
        System.out.println(ans);
    }
}