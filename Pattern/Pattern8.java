package Pattern;

import java.util.Scanner;

public class Pattern8 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size Of row of Pattern :");
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
