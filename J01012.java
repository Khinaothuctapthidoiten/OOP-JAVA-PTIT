import java.util.Scanner;

public class J01012 {
    static void init(int n){
    int cnt=0;
    for(int i=1;i<=Math.sqrt(n);i++){
        if(n%i==0){
            cnt+=(i%2==0? 1:0);
            if(i != n/i) cnt+=((n/i)%2==0? 1:0);
        }
    }
    System.out.println(cnt);
}
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        int n = sc.nextInt();
        init(n);
    }
    sc.close(); 
}
}
