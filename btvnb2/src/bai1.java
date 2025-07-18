import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double r;
        do{
            System.out.print("nhap n: ");
            r=sc.nextDouble();
        }
        while(r<0||r>=1000);
        double c= r*2*3.14;
        double s=Math.pow(r,2)*3.14;
        System.out.println(String.format("%.3f",c)+" "+String.format("%.3f",s));
    }
}
