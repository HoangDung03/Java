package code;

public class Sub_Infor extends infor{
    public void method(){
        //super.a => khong truy cap ddc
        super.b = 2; //=> truy cap dc vi chung goi
        super.c = 3;
    }
}
