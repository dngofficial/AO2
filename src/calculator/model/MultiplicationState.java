package calculator.model;

public class MultiplicationState extends OperationState{


    public MultiplicationState(double theNumber){

        super(theNumber);
    }

    @Override
    public String doOperation(double second_number)
    {
        this.setSecondNumber(second_number);
        return String.valueOf(this.getFirst_number() * second_number);
    }
}