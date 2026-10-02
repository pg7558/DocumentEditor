package doc.BadDesign;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocumentEditor {
    private List<String> elements;
    private String renderedDocument;
    DocumentEditor(){
        elements=new ArrayList<>();
        renderedDocument="";
    }

    public void addText(String text){
        elements.add(text);
    }

    public void addImage(String path){
        elements.add(path);
    }

    public String render(){
        if(renderedDocument.isEmpty()){
            StringBuilder result=new StringBuilder();
            for(String s:elements){
                if(s.length()>4 && (s.endsWith(".jpg") || s.endsWith("png"))){
                    result.append("[Image ").append(s).append("]\n");
                }
                else{
                    result.append(s).append("\n");
                }
            }
            renderedDocument=result.toString();
        }
        return renderedDocument;
    }


    public void save() throws IOException {
        try {
            FileWriter writer = new FileWriter("document.txt");
            writer.write(render());
            writer.close();
            System.out.println("Document save to document.txt");
        }catch(IOException e){
            System.out.println("Unable to open file for writing.");
        }
    }
}
