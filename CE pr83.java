import java.util.*;
import java.io.*;

public class CE pr83 {
    public static void main(String[] args) {
        int lines = 0;
        int words = 0;
        int chars = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String s;

            while ((s = br.readLine()) != null) {
                lines++;

                String[] w = s.trim().split("\\s+");
                if (s.trim().length() > 0)
                    words += w.length;

                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) != ' ')
                        chars++;
                }
            }

            br.close();

            System.out.println(lines);
            System.out.println(words);
            System.out.println(chars);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
