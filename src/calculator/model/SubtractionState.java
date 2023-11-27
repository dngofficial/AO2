package calculator.model;

public class SubtractionState extends OperationState{

    public SubtractionState(double theNumber){

        super(theNumber);
    }

    @Override
    public String doOperation(double second_number)
    {
        this.setSecondNumber(second_number);
        return String.valueOf(this.getFirst_number() - this.getSecondNumber());
    }
}