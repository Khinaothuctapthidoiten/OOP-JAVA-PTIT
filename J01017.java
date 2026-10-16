import java.util.*;

public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t -- > 0){
            String a = sc.next();
            boolean fl = true;
            for(int i = 0; i < a.length() - 1; i++){
                if(Math.abs ( a.charAt(i) - a.charAt(i+1)) != 1 ){
                        fl = false;
                        break;
                }
            }
            System.out.println(fl == true ? "YES":"NO");
        }
        sc.close();
    }
}