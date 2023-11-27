package calculator.model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    private String current_string;
    private String second_backup_string;

    private OperationState state;
    public Calculator(){
        this.current_string = "0";
        this.state = null;
        displayNumber();
    }

    public OperationState getState()
    {
        return this.state;
    }

    public String getCurrentString()
    {
        return this.current_string;
    }



    // Accessed by View. You should edit this method as you build functionality
    public double displayNumber() {
        // TODO
        this.current_string = removeExtraDecimalPoints(this.current_string);
        return Double.parseDouble(this.current_string);
    }

    public void clearPressed() {
        this.state = null;
        this.current_string = "0";
    }

    public void numberPressed(int number) {
        this.current_string += String.valueOf(number);
        //displayNumber();
        // TODO

    }

    public void dividePressed() {
        // TODO
        this.state = new DivisionState(Double.parseDouble(this.current_string));
        this.current_string = "";
    }

    public void multiplyPressed() {
        // TODO
        this.state = new MultiplicationState(Double.parseDouble(this.current_string));
        this.current_string = "";


    }

    public void subtractPressed() {
        // TODO
        this.state = new SubtractionState(Double.parseDouble(this.current_string));
        this.current_string = "";


    }

    public void addPressed() {
        // TODO
        this.state = new AdditionState(Double.parseDouble(this.current_string));
        this.current_string = "";


    }

    public void equalsPressed() {
        // TODO
        String solutionString = this.state.doOperation(Double.parseDouble(this.current_string));
        this.current_string = solutionString;
        this.state = new EqualState(Double.parseDouble(solutionString), this.state.getState());
        //this.state.setFirstNumber(Double.parseDouble(this.current_string));



    }

    public void decimalPressed() {
        // TODO
        this.current_string += ".";
    }

    public static String removeExtraDecimalPoints(String input) {
        Pattern pattern = Pattern.compile("(?<=\\d)(\\.)(?=.*\\1)|(?<=\\d)\\.(?=[^\\d])");
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("");
    }



}
