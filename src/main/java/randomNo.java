
import java.util.*;

public class randomNo {


    static int maxNum(int a,int b,int c){

        int max1=Math.max(a,b);
        int max=Math.max(max1,c);
        return max;
    }
    public static void main(String[] args) {

        int a = (int) Math.floor(Math.random()*1000 +1);
        int b = (int) Math.floor(Math.random()*1000 +1);
        int c = (int) Math.floor(Math.random()*1000 +1);
        System.out.println("Three random no. are: "+a+" "+" "+b+" "+c);
        System.out.println("Max Number is :"+maxNum(a,b,c));

    }
}
