package calculator.model;

public class EqualState extends OperationState{
    private OperationState state;


    public EqualState(double theNumber, OperationState state){
        super(theNumber);
        this.state = state;
    }
    @Override
    public OperationState getState()
    {
        return this.state;
    }

    @Override
    public String doOperation(double second_number)
    {
        state.setFirstNumber(second_number);
        return state.doOperation(state.getSecondNumber());
    }
}