package calculator.model;

public class Calculator {

    private String current_string;
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
        return Double.parseDouble(this.current_string);
    }

    public void clearPressed() {
        // TODO
    }

    public void numberPressed(int number) {
        this.current_string += String.valueOf(number);
        displayNumber();
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
        System.out.println(this.current_string);


    }

    public void decimalPressed() {
        // TODO
    }


}
