package Pattern;

import java.util.Scanner;

public class Pattern7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size Of row of Pattern :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i){
                    System.out.print(" ");
                }else{
                    System.out.print(j-(n-i));
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
