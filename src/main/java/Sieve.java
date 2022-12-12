public class Sieve {
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

// navie method O(n*sqrt(n))
    static void sieve(int n){
        int i=2;
        while(i<=n){
            if(isPrime(i))
                System.out.println(i);

      i++;  }

    }



// Simple Method O(sqrt(n)
static void sieveSim(int n){
        boolean arr[]=new boolean[n+1];
        for(int i=2; i*i<=n; i++){
            if(!arr[i]){
                for (int j=2*i;j<=n;j=j+i){
                    arr[j]=true;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(!arr[i]){
                System.out.println(" "+ i);
            }
        }
}


// Sieve optimize O(nloglogn)
    static void sieveOpt(int n) {
        boolean arr[] = new boolean[n + 1];
        for (int i = 2; i * i <= n; i++) {
            System.out.print(" " + i);

            if (!arr[i]) {
                for (int j = i * i; j <= n; j = j + i) {
                    arr[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        //sieve(17);

       //sieveOpt(17);
        //sieveSim(17);
        sieveOpt(17);

    }



}
