package doc.GoodDesign;

import java.io.FileWriter;
import java.io.IOException;

public class FileStorage implements Persistence{

    @Override
    public void save(String data) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("document1.text");
            fileWriter.write(data);
            fileWriter.close();
        }catch(IOException e){
            System.out.println("File input exception occured.");
        }
    }
}
