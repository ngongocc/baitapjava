
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String name = sc.nextLine();
        System.out.print("Tuổi: ");
        int age = sc.nextInt();
        System.out.print("Chiều cao: ");
        double hight = sc.nextDouble();
        System.out.print("Xin chào "+ name+ ", bạn " + age +" tuổi và cao "+ hight +" mét.");

    }
}