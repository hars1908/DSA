package Pattern;

import java.util.Scanner;

public class Pattern4 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size Of row of Pattern :");
        int n=sc.nextInt();
        int chars=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(Character.toChars(chars));
            }
            chars++;
            System.out.println();
        }
        sc.close();
    }
}
