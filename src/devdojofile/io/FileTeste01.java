package devdojofile.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try {
            //criar o arquivo
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);

            //Path
            System.out.println("Path: "+ file.getPath());
            //Path absoluto
            System.out.println("Path absoluto: "+ file.getAbsolutePath());
            //É um arquivo
            System.out.println("É um arquivo: "+ file.isFile());
            //Se o arquivo é oculto
            System.out.println("É um arquivo oculto: "+ file.isHidden());
            //Ultima modificação
            System.out.println("Ultima modificação: "+ Instant.ofEpochMilli(file.lastModified())
                                                        .atZone(ZoneId.systemDefault()).toLocalDate());

            //deletar o arquivo se existir
            if(file.exists()){
                System.out.println(file.delete());
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
