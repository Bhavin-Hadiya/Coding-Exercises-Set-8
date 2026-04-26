import java.util.*;
import java.io.*;

public class CE pr81 {
    public static void main(String[] args) {
        int chars = 0;
        int words = 0;
        int lines = 0;

        try {
            File f = new File(args[0]);
            BufferedReader br = new BufferedReader(new FileReader(f));

            String s;

            while ((s = br.readLine()) != null) {
                lines++;
                chars += s.length();

                String[] w = s.trim().split("\\s+");
                if (s.trim().length() > 0)
                    words += w.length;
            }

            br.close();

            System.out.println(chars);
            System.out.println(words);
            System.out.println(lines);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("File name missing");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}