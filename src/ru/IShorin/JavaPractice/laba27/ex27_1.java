package ru.IShorin.JavaPractice.laba27;

import java.util.Scanner;

class CalcContr {
    private CalcModel theModel;
    public CalcContr(CalcModel theModel) {
        this.theModel = theModel;
        this.input();
    }
    public void input() {
        int firstNumber, secondNumber = 0;
        char operation;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                firstNumber = scanner.nextInt();
                secondNumber = scanner.nextInt();
                operation = scanner.next().charAt(0);
                theModel.addTwoNumbers(firstNumber, secondNumber, operation);
                System.out.println(theModel.getCalculationValue());
            } catch (Exception ex) {
                System.out.println(ex);
                break;
            }
        }
    }
}
 class CalcModel {
    private int calculationValue;
    public void addTwoNumbers(int firstNumber, int secondNumber, char operation) {
        try {
            switch (operation) {
                case '+':
                    calculationValue = firstNumber + secondNumber;
                    break;
                case '-':
                    calculationValue = firstNumber - secondNumber;
                    break;
                case '*':
                    calculationValue = firstNumber * secondNumber;
                    break;
                case '/':
                    if (secondNumber == 0) {
                        System.out.println("infinity");
                    } else {
                        calculationValue = firstNumber / secondNumber;
                    } break;
                default: throw new Exception();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public int getCalculationValue() {
        return calculationValue;
    }
}
class MVCCalculator {
    public static void main(String[] args) {
        CalcModel theModel = new CalcModel();
        CalcContr theController = new CalcContr(theModel);
    }
}