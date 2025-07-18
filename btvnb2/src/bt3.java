import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.print("n= ");
             n=sc.nextInt();
        }
        while(n<1||n>50);
        int[][] a=new int[100][100];
        int x=1;
        int cot=0;              int hang=0;
        int cot1=n-1;           int hang1=n-1;
        while(x<=n*n){
            for(int i=cot;i<=cot1;i++){
                a[hang][i]=x++;
            }
            hang++;
            for(int i=hang;i<=hang1;i++){
                a[i][cot1]=x++;
            }
            cot1--;
            for(int i=cot1;i>=cot;i--)
            {
                a[hang1][i]=x++;
            }
            hang1--;
            for(int i=hang1;i>=hang;i--)
            {
                a[i][cot]=x++;
            }
            cot++;
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf("%-4d",a[i][j]);
            }
            System.out.print("\n");
        }
    }
}
