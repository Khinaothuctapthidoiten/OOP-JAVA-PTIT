import java.util.*;
public class J01005Chiatamgiac{
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
            int h=input.nextInt();
            for(int i=1;i<=n-1;i++){
                System.out.printf("%.6f ",  (double)(h*(Math.sqrt((double)i/n))));
                
            }
            System.out.println("");
            a--;
        }
        input.close();
    }
}