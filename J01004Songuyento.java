import java.util.*;
public class J01004Songuyento {
    static boolean check(int n){
            if(n<2){
                return false;
            }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        
        while(a>0){
            int n=input.nextInt();
            if(check(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            a--;
        }
        input.close();
    }
}