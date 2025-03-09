package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class Writer {
    public void writeIntoFile(String fileName,String content){
        try{
            BufferedWriter br = new BufferedWriter(new FileWriter(fileName));
            br.write(content);
            System.out.println("Written successfully");
            br.close();
        }catch (FileAlreadyExistsException fr){
            System.out.println("File already exists");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
