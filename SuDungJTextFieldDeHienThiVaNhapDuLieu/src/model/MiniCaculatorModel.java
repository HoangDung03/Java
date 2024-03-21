package model;

public class MiniCaculatorModel {
    private double firstValue;
    private double secondValue;
    private double answer;

    public MiniCaculatorModel() {

    }

    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public void plus(){
        this.answer = this.firstValue + this.secondValue;
    }
    public void minimus(){
        this.answer = this.firstValue - this.secondValue;

    }

    public void multiply(){
        this.answer = this.firstValue * this.secondValue;

    }

    public void devide(){
        this.answer = this.firstValue / this.secondValue;

    }

    public void pow(){
        this.answer = Math.pow(firstValue,secondValue);
    }

    public void mod(){
        this.answer = this.firstValue % this.secondValue;
    }

}
