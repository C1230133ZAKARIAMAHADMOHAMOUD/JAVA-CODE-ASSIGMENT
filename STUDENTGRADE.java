import java.util.Scanner;
public class STUDENTGRADE{
    static String[] studentNames = new String[3];
    static int[] studentGrades = new int[100];
    static int studentCount = 0;

    public static void main(String[] args) {
        Scanner stuinput = new Scanner(System.in);
        Scanner searchstudent = new Scanner(System.in);
        Scanner showreport = new Scanner(System.in);
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("1. Add new Student");
            System.out.println("2. Search Student");
            System.out.println("3. Show report");
            System.out.println("4. exit! ");
            int userinput = input.nextInt();
            switch (userinput) {
                case 1:
                    Addstudent(stuinput);
                    break;
                case 2:
                    Searchingstu(searchstudent);
                    break;
                case 3:
                    Reports(showreport);
                    break;
                case 4:
                    System.out.println("you exit the system");
                    break;
                default:
                    System.out.println("plz enter 1 untill 3 or tab 4 to exit");
                    continue;
            }
            if (userinput == 4){
                break;
            }
        }

    }
    //student method
    public static void Addstudent(Scanner stuinput){

        System.out.println("enter student name! ");
        String name = stuinput.nextLine();

        System.out.println("enter student Grade! ");
        int Grade = stuinput.nextInt();
        stuinput.nextLine();

        if (Grade < 0 || name.length() < 3){
            System.out.println("xogta so galisay wax jiro mahan! ");
        }
        else {
            studentNames[studentCount] = name;
            studentGrades[studentCount] = Grade;
            studentCount++;

            System.out.println("waxad diwan galisay ardayga cusub!! " + name);
        }

    }

    //search student
    public static void Searchingstu(Scanner searchstudent){

        System.out.println("search students! ");
        String searstudent = searchstudent.nextLine();

        for (int i = 0 ; i < studentCount ; i++){
            if (studentNames[i].equalsIgnoreCase(searstudent)){
                System.out.println("you searched student " + studentNames[i] + " his grade " + studentGrades[i]);
                break;
            }
            System.out.println("not found the stduent you searched");
            break;
        }

    }

    //show report

    public static void Reports(Scanner showreport){

        int highest;
        int lowest ;


        int sum = 0;
        highest = studentGrades[0];
        lowest = studentGrades[0];

        for (int i = 0 ; i < studentCount; i++){
//            if (studentNames[i].equalsIgnoreCase(calname)){
            if (studentCount < 3){
                System.out.println("kso dar 3 arday kow");
                return;
            }
            else {
                int avgrade = studentGrades[i];
                sum += avgrade;

                if (avgrade > highest)
                    highest = avgrade;
                if (avgrade < lowest)
                    lowest = avgrade;

            }
        }
        double result = (double) sum / studentCount;

        System.out.println("the avg is: " + result);
        System.out.println("the highest is: " + highest);
        System.out.println("the lowest is: " + lowest);

    }
}