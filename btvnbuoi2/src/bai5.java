public class bai5 {
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            System.out.println("5 * "+i+" = "+(5*i));
        }
        int t=0,s=0;

        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                t+=i;
            }
        }
        System.out.println("tong cac so chan la: "+t);
        int j=1;
        while(j>=1&&j<=100){
            if(j%2==0){
                s+=j;
            }
            j++;
        }
        System.out.print("tong la: "+s);
    }
}
