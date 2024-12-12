/* if n is even, divide it by 2, else subtract 1 from it. For each operation increment the step by 1.

if n=14, 6 steps needed to reduce it to 0. 14/2=7>7-1=6>6/2=3>3-1=2>2/2=1>1-1=0
if n=8, 4 steps needed to reduce it to 0. 8/2=4>4/2=2>2/2=1>1-1=0.
if n=0, 0 steps needed to reduce it to 0.
 */

public class ReduceNumToZero {
    public static void main(String[] args) {
        int n = 14;
        int nx = n;
        int steps = 0;
        if(n==0){
            System.out.println(steps+" steps needed to reduce "+nx+" to zero.");
            System.exit(0);
        }
        while(n!=0){
            if(n%2==0){
                n=n/2;
                steps++;
            }
            else{
                n=n-1;
                steps++;
            }
        }
        System.out.println(steps+" steps needed to reduce "+nx+" to zero.");
    }
}
