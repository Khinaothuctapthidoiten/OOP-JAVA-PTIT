import java.util.*;

public class J01011 {
    static long usc(long a, long b){
        if(b==0) return a;
        return usc(b,a%b);
    }
    static long bsc(long a, long b){
        return (long) a*b / usc(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            long a = sc.nextInt();
            long b = sc.nextInt();
                System.out.print(bsc(a,b));
                System.out.print(" ");
                System.out.println(usc(a,b));
            t--;
        }
        sc.close();
    }
}