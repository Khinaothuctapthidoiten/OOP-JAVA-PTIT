import java.util.*;
public class J01006TinhsoFibonacci {
    static void fib(int n){
        long f1=1,f2=1;
        long[] fibon=new long[100];
        fibon[0]=0;
        fibon[1]=1;
        fibon[2]=1;
        for(int i=3;i<=92;i++){
            long f3=f1+f2;
            f1=f2;
            f2=f3;
            fibon[i]=f3;
        }
        System.out.println(fibon[n]);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        
        while(a>0){
            int n=input.nextInt();
            fib(n);
            
            a--;
        }
        input.close();
    }
}