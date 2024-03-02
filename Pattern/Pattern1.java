package Pattern;

import java.util.Scanner;

public class Pattern1{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size Of row of Pattern :");
        int n=sc.nextInt();
        System.out.println("Enter The Size Of column of Pattern :");
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(0);
            }
            System.out.println();
        }
        sc.close();;
    }
}