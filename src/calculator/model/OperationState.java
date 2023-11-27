package calculator.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class OperationState {

    private final double first_number;

    public OperationState(double theNumber){
        this.first_number = theNumber;
    }
    public double getFirst_number(){return this.first_number;}

    public String doOperation(double second_number)
    {
        return "";
    }
}