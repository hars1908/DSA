package Pattern;

import java.util.Scanner;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size Of row of Pattern :");
        int n=sc.nextInt();
        int chars_outer=64+n;
        for(int i=1;i<=n;i++){
            int chars_inner=chars_outer;
            for(int j=1;j<=i;j++){
                System.out.print(Character.toChars(chars_inner));
                chars_inner++;
            }
            chars_outer--;
            System.out.println();
        }
        sc.close();
    }
}
