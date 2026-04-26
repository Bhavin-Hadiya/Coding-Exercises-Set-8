import java.util.*;
import java.io.*;

public class CE pr82 {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("students.txt");

            fw.write("1 A 80\n");
            fw.write("2 B 75\n");
            fw.write("3 C 90\n");

            fw.close();

            br = new BufferedReader(new FileReader("students.txt"));

            String s;

            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

        } catch (IOException e) {
            System.out.println("Error");
        } finally {
            try {
                if (fw != null)
                    fw.close();
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error");
            }
        }
    }
}