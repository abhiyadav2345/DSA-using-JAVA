import java.math.*;
    public class CountDigits{

        //iterative Solution
        static int countDigits(int x){
            int res=0;
            while(x>0){
                x=x/10;
                res++;
            }
            return res;
        }

// Recursive Solution
        static int countrec(int x){
            int res=0;
            if(x==0){
                return res;
            }
            return 1+ countrec(x/10);

        }
/*
Logarithmic solution
Find no. of digits using log.
We use the concept of log to calculate no. of digits.
log(123)=2.8...
log(1234)=3.98....
and so on.
numbers of digits in 123 =log(123)+1=3
numbers of digits in 1234 =log(1234)+1=4
 */
        static int countlog(int x){
            return (int) Math.floor(Math.log10(x)+1);
        }
        public static void main(String[] args) {

            System.out.println(countlog(45452));
        }
    }


