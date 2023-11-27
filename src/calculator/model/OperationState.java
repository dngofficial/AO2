package calculator.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class OperationState {

    private double first_number;
    private double second_number;


    public OperationState(double theNumber){

        this.first_number = theNumber;
        this.second_number = -1.0;
    }

    public OperationState getState()
    {
        return this;
    }

    public void setFirstNumber(double number)
    {
        this.first_number = number;
    }
    public void setSecondNumber(double number)
    {
        this.second_number = number;
    }
    public double getFirst_number(){return this.first_number;}

    public String doOperation(double second_number)
    {
        return "";
    }

    public double getSecondNumber() {
        return second_number;
    }
}