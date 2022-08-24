import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
                System.out.print("Give me a number a: ");
                int num1 = scan.nextInt();
                System.out.print("Give me a number b: ");
                int num2 = scan.nextInt();

                int res1 = num1 * num1 + num2 * num2;
                double res2 = Math.sqrt(res1);

        System.out.print("hypotenuse: " + res2);




    }
}
