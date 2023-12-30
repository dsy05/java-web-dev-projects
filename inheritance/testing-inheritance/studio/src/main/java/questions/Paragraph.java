package questions;

public class Paragraph extends Question{
    public Paragraph(String question) {
        super(question);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return newLine + getQuestion() + newLine +
                "Please enter a response (500 characters max): " + newLine;
    }

    @Override
    public boolean isInvalid(String resp) {
        return resp.length() >= 500; //if greater than or equal to 500 return true is invalid
    }

}
