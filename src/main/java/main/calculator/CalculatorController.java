package main.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CalculatorController {
    private double x, y;
    private double num1 = 0;
    private String operator = "+";

    @FXML
    public TextField resultField;


    @FXML
    void onNumberClicked(MouseEvent event) {
        int value = Integer.parseInt(((Pane)event.getSource()).getId().replace("btn",""));
        resultField.setText(Double.parseDouble(resultField.getText())==0?String.valueOf((double)value):String.valueOf(Double.parseDouble(resultField.getText())*10+value));
    }

    @FXML
    void onSymbolClicked(MouseEvent event) {
        String symbol = ((Pane)event.getSource()).getId().replace("btn","");
        if(symbol.equals("Equals")) {
            double num2 = Double.parseDouble(resultField.getText());
            switch (operator) {
                case "+" -> resultField.setText((num1+num2) + "");
                case "-" -> resultField.setText((num1-num2) + "");
                case "*" -> resultField.setText((num1*num2) + "");
                case "/" -> resultField.setText((num1/num2) + "");
            }
            operator = ".";
        }
        else if(symbol.equals("Clear")) {
            resultField.setText(String.valueOf(0.0));
            operator = ".";
        }
        else {
            switch (symbol) {
                case "Plus" -> operator = "+";
                case "Minus" -> operator = "-";
                case "Multiply" -> operator = "*";
                case "Divide" -> operator = "/";
            }
            num1 = Double.parseDouble(resultField.getText());
            resultField.setText(String.valueOf(0.0));
        }
    }
}


