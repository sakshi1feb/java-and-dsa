package PatternQuestion;

import java.util.Scanner;

/**
 *     *****
 *     *****
 *     *****
 *     *****
 *     *****
 *          */
public class kk1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
