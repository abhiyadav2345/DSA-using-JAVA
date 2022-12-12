 import java.util.Scanner;
public class divisor {

    static boolean isPrime(int n){
        if (n==1)
            return false;
        if (n==2||n==3)
            return true;
        if(n%2==0 || n%3==0) //eleminating multiple of 2 and 3
            return false;
        else
            for (int i=5;i*i<=n;i+=6) // check if i or i+2 divides n if true then  it is not a prime number else prime number
                if(n%i==0  || n%(i+2)==0)
                    return false;
        return true;
    }


    //Naive method
    static void divisor(int n){
        for (int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
static void divisorbetter(int n){


        if(isPrime(n))
            System.out.println(n);
        else {
            for (int i = 1; i * i <= n; i++) {
                 if(n % i == 0) {
                    System.out.println(i);
                    if(i!=n/i)
                    System.out.println(n/i);
                }
            }
        }
}


static void divisorsort(int n){

        int i;
        for(i=1;i*i<n;i++){
            if(n%i==0)
                System.out.println(i);
        }
        for (i=n; i>=1;i--){
            if(n%i==0)
                System.out.println(n/i);
        }

}


    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();


        divisorbetter(a);

        divisor(a);
    divisorsort(a);
    }
}
