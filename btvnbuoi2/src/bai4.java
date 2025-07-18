import java.util.Scanner;
public class bai4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap n = ");
        int n=sc.nextInt();
        int t=0;
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"] = ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("a["+i+"]= "+arr[i]);
        }
        for(int i=0;i<n;i++){
            t+=arr[i];
        }
        System.out.println("tong cac phan tu: "+t);
        int tg=arr[0];
        for(int i=0;i<n;i++){
            if(tg<arr[i]){
                tg=arr[i];
            }
        }
        System.out.print("GTLN: "+tg);
    }
}
