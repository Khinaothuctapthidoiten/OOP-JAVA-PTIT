import java.util.*;
public class J01001Hinhchunhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if(a<=0 || b<=0){
            System.out.println(0);
        }
        else{
            System.out.print((a+b)*2+ " ");
            System.out.println(a*b);
        }
        input.close();
    }
}