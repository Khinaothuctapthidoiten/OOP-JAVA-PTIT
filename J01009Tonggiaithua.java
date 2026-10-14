import java.util.*;

public class J01009Tonggiaithua {
    static void pt(int n) {
        long cnt = 1, sum = 0;
        for (int i = 1; i <= n; i++) {
            cnt *= i;
            sum += cnt;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        pt(n);
        sc.close();
    }
}