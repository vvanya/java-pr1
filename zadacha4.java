

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
                System.out.print("Скільки школярів?: ");
                int num1 = scan.nextInt();
                System.out.print("Скільки яблук в кошику?: ");
                int num2 = scan.nextInt();

                int res1 = num2 % num1;

        System.out.print("В кошику залишилось: " + res1);




    }
}
