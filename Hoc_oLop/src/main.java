import java.io.*;


public class main {
    public static void main(String[] args) {
        try {
            File file = new File("E:\\Intellij\\Hoc_oLop\\src\\t.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            fr.close();
            br.close();
        }catch (Exception e) {

        }
    }
}

/*


 */