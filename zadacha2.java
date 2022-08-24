

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
                System.out.print("Give me a number : ");
                int num1 = scan.nextInt();

                int res1 = num1 + 1;

                int res2 = num1 - 1;

                System.out.println("The next number for the number " + num1 + " is " + res1);
                System.out.print("The previous number for the number " + num1 + " is " + res2);



    }
}
