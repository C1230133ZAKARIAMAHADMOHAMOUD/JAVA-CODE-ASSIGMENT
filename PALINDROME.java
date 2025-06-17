import java.util.Scanner;

public class PALINDROME {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word, reverse = "";

        System.out.print("FADLAN GALI WORDS AMA TIRO !! :");
        word = input.nextLine();

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }


        if (word.equals(reverse)) {
            System.out.println(" WAA PALINDROME ");

        } else {
            System.out.println(" MA'AHAN PALINDROME");
        }

    }
}
