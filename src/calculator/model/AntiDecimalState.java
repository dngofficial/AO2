package calculator.model;

public class AntiDecimalState extends StringState {
    private String main_string;
    public AntiDecimalState(String mainstring){
        super(mainstring);
    }
    @Override
    public void appendDecimalPoint()
    {
        //nothing
    }


}