package Project;


import java.util.Scanner;

public class Quiz_project {
    public static void main(String[] args) {

        int right_answer = 0;
        int Wrong_answer = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("////  QUIZ  ////");
        System.out.println("Start the quiz 1 / 0");
        int quiz = sc.nextInt();

        if (quiz == 1) {
            System.out.println("Answer the following questions");
            System.out.println("Q.01 Which of the following is not a primitive datatype " + "\n" + "A. int" + "\n" + "B. float" + "\n" + "c. String" + "\n" + "d. Char");

            sc.nextLine();
            String Ans1 = sc.nextLine();
            if (Ans1 == "C");
            right_answer ++;

             if (Ans1 == "C")
                    System.out.println("Q.02 What is the output of the following code");
                System.out.println("int x = 10;" + "\n" + "int y = 20;"+ "\n" + "System.out.println(x + y);");
                System.out.println("A. 30" + "\n" + "B. 100" +"\n" + "C. 20" + "\n" + "D. None");

            String Ans2 = sc.nextLine();
            if (Ans2 == "A");
            right_answer++;

            if (Ans2 == "A");
                {
                    System.out.println("Q.03 What is the keyword used to declare the class in java");
                    System.out.println("A. Class" + "\n" + "B. Struct" +"\n" + "C. Object" + "\n" + "D. None");

                    String Ans3 = sc.nextLine();
                    if (Ans3 == "A");
                    right_answer++;

                    if(Ans3 == "A");
                    System.out.println("Q.04 What is the return type of the Math.sqrt() method?");

                    System.out.println("A. int" + "\n" + "B. float" +"\n" + "C. double" + "\n" + "D. void");

                    String Ans4 = sc.nextLine();
                    if (Ans4 == "C");
                    right_answer++;

                    if(Ans4 == "C");

                    System.out.println("Q.05 What is the keyword used to create an object of a class in java?");
                    System.out.println("A. new" + "\n" + "B. Create" +"\n" + "C. object" + "\n" + "D. None");

                    String Ans5 = sc.nextLine();
                    if (Ans5 == "A");
                    System.out.println(right_answer++);


                }

        }

        }


    }