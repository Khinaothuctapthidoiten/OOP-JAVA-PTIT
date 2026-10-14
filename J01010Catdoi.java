import java.util.*;

public class J01010Catdoi{
    static void pt(String n) {
        String tmp = "";
        for (int i = 0; i < n.length(); i++) {
            char x = n.charAt(i);
            if (x == '0' || x == '8' || x == '9') {
                tmp += "0";
            } else if (x == '1') {
                tmp += '1';
            } else {
                tmp = "INVALID";
                break;
            }
        }
        int i;
        for (i = 0; i < tmp.length(); i++)
            if (tmp.charAt(i) != '0')
                break;
        if (i == tmp.length() && tmp.charAt(tmp.length() - 1) == '0') {
            System.out.println("INVALID");
        } else {
            System.out.println(tmp.substring(i, tmp.length()));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            String n = sc.next();
            pt(n);
        }
        sc.close();
    }
}
