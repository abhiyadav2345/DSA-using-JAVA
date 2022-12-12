import java.util.*;
import java.io.*;
public class Prime_sum {

    //{ Driver Code Starts
//Initial Template for Java
//Initial Template for Java


        public static void main(String args[]) throws IOException {
            BufferedReader read =
                    new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            while (t-- > 0) {
                int N = Integer.parseInt(read.readLine());
                Solution ob = new Solution();

                System.out.println(ob.isSumOfTwo(N));
            }
        }
    }
// } Driver Code Ends




    //User function Template for Java
    class Solution {

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

        static String isSumOfTwo(int N) {
            // code here
            int j = 0, i = 2;
            int arr[]=new int[N];
            while (j <= N) {

                if (isPrime(i)) {
                    arr[j] = i;

                }
                j++;
                i++;

            }
            int k = 0;

            for (int m = 0; m < 100; m++) {

                System.out.print(" " + arr[m]);
            }
/*
            while(k<=arr.length-1){

                for(int l=k;l<=arr.length-1;l++){

                    if(arr[k]+arr[l]==N){
                        return "Yes";
                    }

                }
                k++;

            }
            return "NO";
        }*/
        return "NO";} }

