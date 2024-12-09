import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {

        //INPUTVAR
        String name = " ";
        String block = " ";
        double score = 0;
        
        //CONSTVAR
        double passingGrade = 60;

        //INPUT
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
            name = input.nextLine();
        System.out.print("Please enter your course and block: ");
            block = input.nextLine();
        System.out.print("Please enter the score you have received on the recent exam: ");
            score = input.nextDouble();

        //CONDITIONS
        if (score >= passingGrade) {
            System.out.println("You passed! Congratulations!");
        }

        else {
            System.out.println("You failed, please review or learn more about the topic and try again.");
        }



    }
}