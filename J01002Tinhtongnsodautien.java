import java.util.*;
public class J01002Tinhtongnsodautien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        while(a>0){
            long n = input.nextInt();
            System.out.println((1+n)*n/2);
            a--;
        }
        input.close();
    }
}