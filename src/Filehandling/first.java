package Filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class first {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/RevathiTannidi/IdeaProjects/java_learning/src/Filehandling/output.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = br.readLine()) != null) {
            // Split the line into values
            String[] values = line.split(",");
            // Print values for debugging
            for (String value : values) {
                System.out.print(value + " ");
            }

            System.out.println();
        }
        br.close();
    }
}

