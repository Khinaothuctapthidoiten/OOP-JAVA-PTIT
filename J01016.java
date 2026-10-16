import java.util.Scanner;

public class J01016 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int cnt = 0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='4' || n.charAt(i)=='7') cnt++;
        }
        System.out.println((cnt == 4|| cnt == 7) ? "YES" : "NO");
        sc.close();
    }
}
