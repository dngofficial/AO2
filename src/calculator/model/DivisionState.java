package calculator.model;

public class DivisionState extends OperationState{


    public DivisionState(double theNumber){

        super(theNumber);
    }

    @Override
    public String doOperation(double second_number)
    {
        this.setSecondNumber(second_number);
        return String.valueOf(this.getFirst_number() / second_number);
    }
}