import questions.*;

public class SurveyRunner{
    private static final Survey survey = new Survey();

    public static void main(String[] args) {

        // create questions

        Choice[] trueAndFalse = {
                new Choice("True"),
                new Choice("False")
        };
        TrueOrFalse driving = new TrueOrFalse("Do you like driving long distances(5 or more hours)?", trueAndFalse);
        TrueOrFalse flying = new TrueOrFalse("Do you enjoy flying in an airplane?", trueAndFalse);

        Choice[] flavorChoice = {
                new Choice("Tiramisu"),
                new Choice("Cheesecake"),
                new Choice("Red Velvet")
        };
        MultipleChoice flavor = new MultipleChoice("Pick an ice cream flavor:", flavorChoice);

        LinearScale numScoops = new LinearScale("How many scoops of ice cream would you like?", 5);

        Choice[] toppingsChoice = {
                new Choice("Blueberries"),
                new Choice("M&M's"),
                new Choice("Fudge"),
                new Choice("Butterscotch"),
                new Choice("Pecan's")
        };
        Checkbox toppings = new Checkbox("Add desired toppings:", toppingsChoice);

        ShortAnswer flavorQuestion = new ShortAnswer("What flavors would you like to see added?");

        Paragraph comments = new Paragraph("Any comments or suggestions?");

        // add to survey
        survey.addQuestions(new Question[] {driving, flying, flavor, numScoops, toppings, flavorQuestion, comments});

        //interact with user (intro, run survey outro)
        String newLine = System.lineSeparator();
        System.out.println("Thank you for Registering! We will be serving desert at the meetup and would like your preference ahead of time." + newLine);

        survey.run();
        System.out.println(newLine + "Thank you! YOur preferences have been noted!" +
                newLine + "\t" + String.join(newLine + "\t", survey.getAllResponses()) + newLine);

    }
}
