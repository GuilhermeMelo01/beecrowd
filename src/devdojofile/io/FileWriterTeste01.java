package devdojofile.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("Guilherme estudando no domingo, é isso!\ncontinuando na proxima linha\n");
            fileWriter.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
