package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Reader {

    public void readFromFile(String filePath){
        try( BufferedReader br= new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = br.readLine()) != null) System.out.println(line);
        }catch (FileNotFoundException fr){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("Error while reading in file");
        }
    }
}
