import java.util.*;

public class fibo {
int f=1;
    static int[] fib(int x){
        int arr[]=new int[x];

        int i=0;
        while(i<x){
            arr[i]=i;
            i++;
        }

       int j=2;
        while(j<x){
           arr[j]=arr[j-1]+arr[j-2];
           j++;
                      }

        return arr;

    }
    public static void main(String[] args) {

int i=0;
int arr[]=fib(10);
while(i<10){
    System.out.println(arr[i]);
    i++;

}


    }



}
