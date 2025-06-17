import java.util.Scanner;

public class SENTINELVALUE {
    public static void main(String[] args) {
        String stops = "n";
        int total_sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the numbers to address n to exit: ");

//        int x = input.nextInt();
        while (true) {
            System.out.println("enter number :");
            String stop = input.nextLine();
            char n = stop.charAt(0);
            if (n == 'n') {
                break;
            }
            else {
                int number = Integer.parseInt(stop);
                total_sum += number;
            }

        }
        System.out.println("the sum number is : "+total_sum);

        }

}

