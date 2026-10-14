import java.util.*;
public class J01007KiemtrasoFibonacci{
    static boolean fib(long n){
        long f1=1,f2=1;
        long[] fibon=new long[100];
        fibon[0]=0;
        fibon[1]=1;
        fibon[2]=1;
        for(int i=3;i<=93;i++){
            long f3=f1+f2;
            f1=f2;
            f2=f3;
            fibon[i]=f3;
        }
        return Arrays.stream(fibon).anyMatch(x -> x==n);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        
        while(a>0){
            long n=input.nextLong();
            if(fib(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
            a--;
        }
        input.close();
    }
}