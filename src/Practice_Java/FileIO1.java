package Practice_Java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileIO1 {


        public static void main(String[] args) throws IOException {

            File file = new File("src/Practice_Java/demo.txt");
            System.out.println(file.exists());
            List<String> marks = Files.readAllLines(Path.of("src/Practice_Java/demo.txt"));

            System.out.println(marks.toString());
        }
    }

