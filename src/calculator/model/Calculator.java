package calculator.model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    private StringState current_string;

    private OperationState state;
    public Calculator(){
        this.current_string = new StringState("0");
        this.state = null;
        displayNumber();
    }

    public OperationState getState()
    {
        return this.state;
    }

    public String getCurrentString()
    {
        return this.current_string.getMainString();
    }



    // Accessed by View. You should edit this method as you build functionality
    public double displayNumber() {
        // TODO
        return Double.parseDouble(this.current_string.getMainString());
    }

    public void clearPressed() {
        this.state = null;
        this.current_string = new StringState("0");
    }

    public void numberPressed(int number) {
        this.current_string.appendNumber(String.valueOf(number));
        //displayNumber();
        // TODO

    }

    public void dividePressed() {
        // TODO
        this.state = new DivisionState(Double.parseDouble(this.current_string.getMainString()));
        this.current_string = new StringState("");

    }

    public void multiplyPressed() {
        // TODO
        this.state = new MultiplicationState(Double.parseDouble(this.current_string.getMainString()));
        this.current_string = new StringState("");


    }

    public void subtractPressed() {
        // TODO
        this.state = new SubtractionState(Double.parseDouble(this.current_string.getMainString()));
        this.current_string = new StringState("");


    }

    public void addPressed() {
        // TODO
        this.state = new AdditionState(Double.parseDouble(this.current_string.getMainString()));
        this.current_string = new StringState("");


    }

    public void equalsPressed() {
        // TODO
        String solutionString = this.state.doOperation(Double.parseDouble(this.current_string.getMainString()));
        this.current_string = new StringState(solutionString);
        this.state = new EqualState(Double.parseDouble(solutionString), this.state.getState());
        //this.state.setFirstNumber(Double.parseDouble(this.current_string));



    }

    public void decimalPressed() {
        // TODO
        this.current_string.appendDecimalPoint();
        this.current_string = new AntiDecimalState(this.current_string.getMainString());
    }





}
