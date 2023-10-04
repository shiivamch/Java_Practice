package Demo;

public class Voting_system_using_condition {
    public static void main(String[] args) {


        int age = 23   ;
        String nationality = "Indian";

        if (age > 18 && age < 99) {
            if (nationality == "Indian" || nationality == "indian" || nationality == "india") {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You are not eligible to vote");
            }
        }
    }
}