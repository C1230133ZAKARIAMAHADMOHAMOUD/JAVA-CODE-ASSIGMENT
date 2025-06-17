import java.util.Scanner;

public class PRIMENUMBER {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, i, isPrime = 1;

        System.out.print("FADLAN GALI TIRADA AAD RABTO !! : ");
        num = input.nextInt();

        if (num <= 1) {
            isPrime = 0;
        }

        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = 0;
                break;
            }
        }

        if (isPrime == 1) {
            System.out.println(" WAA PRIME NUMBER.");
        } else {
            System.out.println(" MA'AHAN PRIME NUMBER.");
        }

    }
}
