import java.util.*;
public class J01013 {
    public static int N = 2000005;
    public static ArrayList<Integer> a = new ArrayList<>();
    static void init(){
        boolean fl[] = new boolean[N];
        Arrays.fill(fl,true);
        fl[0]=false;
        fl[1]=false;
        for(int i = 2;i * i < N - 5; i++){
            if(fl[i]){
                for(int j = i * i; j < N - 5; j+=i){
                    fl[j] = false;
                }
            }
        }
        for(int i = 2; i < fl.length; i++){
            if(fl[i]) a.add(i);
        }
    }       
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long cnt=0;
        init();
        while(n-->0){
            int N = sc.nextInt();
            for(int prime : a){
                if(prime * prime > N) break;
                while(N % prime == 0){
                    N /= prime;
                    cnt += prime;
                }
            }
            if(N > 1) cnt += N;
        }
        sc.close();
        System.out.println(cnt);
    }
   
}
