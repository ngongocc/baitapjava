import java.util.Scanner;
public class bai3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("nhập a: ");
        int a= sc.nextInt();
        System.out.print("nhập b: ");
        int b= sc.nextInt();
        System.out.println("Tổng a + b = "+(a+b));
        System.out.println("Hiệu a - b = "+(a-b));
        System.out.println("Tích a * b = "+(a*b));
        System.out.println("Thương a / b = "+(a/b));
        System.out.println("Số dư a % b = "+(a%b));
    }
}
