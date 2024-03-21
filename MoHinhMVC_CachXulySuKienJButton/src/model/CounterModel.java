package model;

public class CounterModel {
    private int value;

    // Tạo một biến value gán giá trị bằng 0
    public CounterModel() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // Viết hàm tăng cho biến value
    public void increment(){
        this.value++;
    }

    // Viết hàm giảm co biến value
    public void decrement(){
        this.value--;
    }

    // Viết hàm đưa
    public void reset(){
        this.value = 0;
    }

}
