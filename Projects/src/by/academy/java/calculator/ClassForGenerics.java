package by.academy.java.calculator;

public class ClassForGenerics<I extends Number, D extends Number> {

    private I firstNumber;
    private D secondNumber;

    public ClassForGenerics(I firstNumber, D secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

    }

    public I getFirstNumber() {
        return firstNumber;
    }

    public D getSecondNumber() {
        return secondNumber;
    }
}
