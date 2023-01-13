public class Pow {
/* Naive Method

Time complexity: O(n)
*/
    static int powNaive(int x,int n){
        int ans =1;
         for(int i=0;i<n;i++){
            ans*=x;
        }
            return ans;
    }

    /*
    Efficient Solution

    pow(x,n)={if(n%2==0) pow(x,n/2)*pow(x,n/2)
             {else
             {pow(x,n-1)*x

            time Complexity: O(log(n))
    */

     static int powOpt(int x, int n){
        if(n==0)
            return 1;
        int temp=powOpt(x,n/2);
        temp=temp*temp;
        if(n%2==0)
            return temp;
        else
            return temp*x;

    }

/*
Iterative Power (Binary Exponentiation)
* Every number can be written as sum of powers of 2 (sets bits in binary representation)
* We can traverse through all bits of a number (from LSB to MSB) in O(log(n)) time.

res=1;
while(n>0){
if(n%2!=0)
//bit is 1
else
//bit is 0

n=n/2;
x=x*x;
}
 */
    static int iterativePower(int x, int n){
        int res=1;
        while(n>0){
            if(n%2!=0)
             res=res*x;
                x*=x;
            n=n/2;
        }
        return res;
    }






    public static void main(String[] args) {

        //System.out.print(powNaive(5,20));
          System.out.print(iterativePower(2,10));
    }


}
