package calculator.model;

public class StringState {
    private String main_string;
    public StringState(String mainstring){

        this.main_string = mainstring;
    }

    public String getMainString()
    {
        return this.main_string;
    }

    public void setString(String string)
    {
        this.main_string = string;
    }

    public void appendNumber(String number)
    {
        this.main_string += number;
    }

    public void appendDecimalPoint()
    {
        this.main_string += ".";
    }


}