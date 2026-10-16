import java.util.Scanner;

public class J01018 {
    static boolean init(String n){
        int cnt = 0;
        for(int i = 0; i < n.length(); i++){
            cnt += n.charAt(i) - '0';
        }
        if(cnt%10!=0) return false;
        for(int i = 0 ;i < n.length()-1;i++){
            if(Math.abs(n.charAt(i) - n.charAt(i+1)) != 2) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t -- > 0){
            sc.nextLine();
            String n = sc.next();
            System.out.println(init(n) ? "YES":"NO");
        }
        sc.close();
    }
}
