import java.util.Scanner;

public class J01020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            long n = sc.nextLong();
            if(n==0){
                System.out.println("Impossible");
                continue;
            }
            boolean fl[] = new boolean[10];
            int i=1;
            int cnt=0;
            while(true){                
                long m = i*n;
                while(m>0){
                    if(!fl[(int)m%10]){
                        fl[(int)m%10] = true;
                        cnt+=1;
                    }
                    m/=10;
                }
                if(cnt==10) break;
                i++;
            }
            System.out.println(n*i);
            
        }
        sc.close();
    }
}
