import questions.*;

public class QuizRunner {

    //Create Quiz
    private static final Quiz quiz = new Quiz();

    public static void main(String[] args) {
        //create questions
        String q1 = "Which of the following are books by Jane Austen?";
        Choice[] q1Choices = new Choice[] {
                new Choice("Jane Eyre"),
                new Choice("Pride and Prejudice", true),
                new Choice("Wives and Daughters"),
                new Choice("Mansfield Park", true)
        };
        Checkbox question1 = new Checkbox(q1, q1Choices);

        String q2 = "The Earth is flat.";
        Choice[] q2Choices = new Choice[] {
                new Choice("False", true),
                new Choice("True")
        };
        TrueOrFalse question2 = new TrueOrFalse(q2, q2Choices);

        String q3 = "What is the name of lunar object that orbits Earth?";
        Choice[] q3Choices = new Choice[] {
                new Choice("Titan"),
                new Choice("Moon", true),
                new Choice("Pluto"),
                new Choice("Sun")
        };
        MultipleChoice question3 = new MultipleChoice(q3, q3Choices);

        //add questions to quiz
        quiz.addQuestions(new Question[]{question1, question2, question3});

        //interact with user (run quiz, giving score)
        quiz.run();

        String newLine = System.lineSeparator();
        System.out.println(newLine + "You Answered " + quiz.getNumCorrect() +
                " of " + quiz.getQuestions().size() +
                " questions correctly. Thanks for playing!" + newLine);

    }
}
