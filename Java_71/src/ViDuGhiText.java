import java.io.IOException;
import java.io.PrintWriter;

public class ViDuGhiText {
    public static void main(String[] args) {

        try{
            PrintWriter pw = new PrintWriter("E:\\Intellij\\Java_71\\file.txt ", "UTF-8");
            pw.println("Hoàng Dũng");
            pw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
