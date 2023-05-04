package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.text.DecimalFormat;

public class HelloController {
    @FXML
    private TextField calcResult;

    DecimalFormat df = new DecimalFormat("#.##");
    double answer = 7.396589277E9;
    int check = 0;
    String operator;
    double firstCalc;
    double secondCalc;
    int op;
    int num;

    public void clear(ActionEvent e) throws IOException {
        num = 0;
        op = 0;
        calcResult.setText("");
        firstCalc = 0;
        secondCalc = 0;
    }

    public void uno(ActionEvent e) throws IOException {
        if (num <= 1) {
            num++;
            calcResult.setText(calcResult.getText() + "1");
        }
        else if(op == 1){
            calcResult.setText("");
            calcResult.setText("");
            calcResult.setText("");
            calcResult.setText(calcResult.getText() + "1");
            op++;
            check = 0;
            num = 1;
        }
    }

    public void dos(ActionEvent e) throws IOException {
        if (num <= 1) {
            num++;
            calcResult.setText(calcResult.getText() + "2");
        }
        else if(op == 1){
            calcResult.setText("");
            calcResult.setText("");
            calcResult.setText("");
            calcResult.setText(calcResult.getText() + "2");
            op++;
            check = 0;
            num = 1;
        }
    }

    public void tres(ActionEvent e) throws IOException {
        if (num <= 1) {
            num++;
            calcResult.setText(calcResult.getText() + "3");
        }
        else if(op == 1){
            calcResult.setText("");
            calcResult.setText("");
            calcResult.setText(calcResult.getText() + "3");
            op++;
            check = 0;
            num = 1;
        }
    }

    public void cuatro(ActionEvent e) throws IOException {
        if (num <= 1) {
            num++;
            calcResult.setText(calcResult.getText() + "4");
        }
        else if(op == 1){
            calcResult.setText("");
            calcResult.setText("");
            calcResult.setText(calcResult.getText() + "4");
            op++;
            check = 0;
            num = 1;
        }
    }

    public void cinco(ActionEvent e) throws IOException {
        if (num <= 1) {
            num++;
            calcResult.setText(calcResult.getText() + "5");
        }
        else if(op == 1){
            calcResult.setText("");
            calcResult.setText("");
            calcResult.setText(calcResult.getText() + "5");
            op++;
            check = 0;
            num = 1;
        }
    }

    public void seis(ActionEvent e) throws IOException {
        if (num <= 1) {
            num++;
            calcResult.setText(calcResult.getText() + "6");
        }
        else if(op == 1){
            calcResult.setText("");
            calcResult.setText("");
            calcResult.setText(calcResult.getText() + "6");
            op++;
            check = 0;
            num = 1;
        }
    }

    public void siete(ActionEvent e) throws IOException {
        if (num <= 1) {
            num++;
            calcResult.setText(calcResult.getText() + "7");
        }
        else if(op == 1){
            calcResult.setText("");
            calcResult.setText("");
            calcResult.setText(calcResult.getText() + "7");
            op++;
            check = 0;
            num = 1;
        }
    }

    public void ocho(ActionEvent e) throws IOException {
        if (num <= 1) {
            num++;
            calcResult.setText(calcResult.getText() + "8");
        }
        else if(op == 1){
            calcResult.setText("");
            calcResult.setText("");
            calcResult.setText(calcResult.getText() + "8");
            op++;
            check = 0;
            num = 1;
        }
    }

    public void nueve(ActionEvent e) throws IOException {
        if (num <= 1) {
            num++;
            calcResult.setText(calcResult.getText() + "9");
        }
        else if(op == 1){
            calcResult.setText("");
            calcResult.setText("");
            calcResult.setText(calcResult.getText() + "9");
            op++;
            check = 0;
            num = 1;
        }
    }

    public void cero(ActionEvent e) throws IOException {
        if (num <= 1) {
            num++;
            calcResult.setText(calcResult.getText() + "0");
        }
        else if(op == 1){
            calcResult.setText("");
            calcResult.setText("");
            calcResult.setText(calcResult.getText() + "0");
            op++;
            check = 0;
            num = 1;
        }
    }

    public void plus(ActionEvent e) throws IOException {
        {
            if(op < 1){
                operator = "+";
                op = 1;
                num = 2;
                firstCalc = Double.parseDouble(calcResult.getText());
                calcResult.setText("");
                calcResult.setText("");
                calcResult.setText("+");
            }
        }
    }
    public void minus(ActionEvent e) throws IOException {
        {
            if(op < 1){
                operator = "-";
                op = 1;
                num = 2;
                firstCalc = Double.parseDouble(calcResult.getText());
                calcResult.setText("-");
            }
        }
    }
    public void multiply(ActionEvent e) throws IOException {
        {
            if(op < 1){
                operator = "*";
                op = 1;
                num = 2;
                firstCalc = Double.parseDouble(calcResult.getText());
                calcResult.setText("*");
            }
        }
    }
    public void divide(ActionEvent e) throws IOException {
        {
            if(op < 1){
                operator = "/";
                op = 1;
                num = 2;
                firstCalc = Double.parseDouble(calcResult.getText());
                calcResult.setText("/");
            }
        }
    }
    public void equal(ActionEvent e) throws IOException {
        {
            if (check == 0) {
                if (operator.equals("+")) {
                    secondCalc = Integer.parseInt(calcResult.getText());
                    double result = firstCalc + secondCalc;
                    calcResult.setText(String.valueOf(result));
                    check++;
                    num = 2;
                    op = 0;
                    if (result >= answer) {
                        calcResult.setText("Out of Bounds Error :(");
                        num = 2;
                        op = 2;
                    }
                }
                if (operator.equals("-")) {
                    secondCalc = Integer.parseInt(calcResult.getText());
                    double result = firstCalc - secondCalc;
                    calcResult.setText(String.valueOf(result));
                    check++;
                    num = 2;
                    op = 0;
                    if (result >= answer) {
                        calcResult.setText("Out of Bounds Error :(");
                        num = 2;
                        op = 2;
                    }
                }
                if (operator.equals("*")) {
                    secondCalc = Integer.parseInt(calcResult.getText());
                    double result = firstCalc * secondCalc;
                    calcResult.setText(String.valueOf(result));
                    check++;
                    num = 2;
                    op = 0;
                    if (result >= answer) {
                        calcResult.setText("Out of Bounds Error :(");
                        num = 2;
                        op = 2;
                    }
                }
                if (operator.equals("/")) {
                    secondCalc = Double.parseDouble(calcResult.getText());
                    double result = (double) firstCalc / secondCalc;
                    calcResult.setText(String.valueOf(df.format(result)));
                    check++;
                    num = 2;
                    op = 0;
                    if (result >= answer) {
                        calcResult.setText("Out of Bounds Error :(");
                        num = 2;
                        op = 2;
                    }
                }
            }
        }
    }
}