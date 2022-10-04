package QuizGame;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private static ArrayList<Question> questions = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        init(2);
        loop();


    }

    //Methods

    public static void init(int number) {


        try {
            List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\37256\\IdeaProjects\\Games_Tasks\\src\\Data\\quiz" + number + ".txt"));


            int numberOfLinesPerQuestion = Integer.parseInt(lines.get(0))+1;


            for (int i = 1; i < lines.size(); i += numberOfLinesPerQuestion) {
                Question q;
                if (numberOfLinesPerQuestion == 4) {
                    q = new Question(lines.get(i), lines.get(i + 1), lines.get(i + 2), lines.get(i + 3));
                } else {
                    q = new Question(lines.get(i), lines.get(i + 1), lines.get(i + 2), lines.get(i + 3), lines.get(i + 4));
                }
                questions.add(q);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
            System.out.println("Could not load the file");
            System.exit(5);
        }
    }

    public static void loop() {
            int score=0;
        while (questions.size()>0){


            Question currentQuestion = questions.remove(0);
            System.out.println(currentQuestion.getText());
// List of answers
            for (int i=0; i<currentQuestion.getAnswers().length;i++){
                System.out.println(i+1 + ") " + currentQuestion.getAnswers()[i]);
            }

            System.out.println("Answer: ");
            int choose = scanner.nextInt();

            if (choose<0 || choose > currentQuestion.getRightAnswer().length()){
                System.out.println("Input is valid");
                System.exit(10);
            }
            if(currentQuestion.getRightAnswer().equals(currentQuestion.getAnswers()[choose-1])){
                System.out.println("Right");
                score++;
            }else{
                System.out.println("Wrong");
            }
        }
            System.out.println("You have "+ score + " questions right" );
    }

}








