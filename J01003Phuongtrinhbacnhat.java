import java.util.*;
public class J01003Phuongtrinhbacnhat{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if(a==0){
            if(b==0){
                System.out.println("VSN");
            }
            else{
                System.out.println("VN");
            }
        }
        else{
            System.out.printf("%.2f",(double)-b/a);
        }
        input.close();
    }
}