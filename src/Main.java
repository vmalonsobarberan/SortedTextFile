import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SortedTextFile stf = new SortedTextFile("text.txt");
        /* stf.put("EEEEEE");
        stf.put("AAAAAA");
        stf.put("SSSSSS");
        stf.put("BBBBBB");
        stf.put("TTTTTT"); */
        stf.removeElementAt(3);
    }
}
