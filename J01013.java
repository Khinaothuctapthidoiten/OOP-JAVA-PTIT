import java.util.*;
public class J01013 {
    static int init(int n){
        int sum=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                while(n%i==0){
                    n/=i;
                    sum+=i;
                }
            }
        }
        if(n>1) sum+=n;
        return sum;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=0;
        while(n-->0){
            int a = sc.nextInt();
            cnt+=init(a);
        }
        sc.close();
        System.out.println(cnt);
    }
   
}
