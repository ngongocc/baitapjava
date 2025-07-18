import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap kich thuoc mang: ");
        int n=sc.nextInt();
        int[] a= new int[100];
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]= ");
            a[i]=sc.nextInt();
        }
        int []b=new int[100];
        for(int i=0;i<n;i++)
        {
            b[i]=a[i];
        }
        for(int i=0;i<n;i++) {
            if (i % 2 == 1) {
                a[i] += Math.abs(b[i - 1] - b[i + 1]);
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
