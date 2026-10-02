package doc.GoodDesign;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<DocumentElement> documentElements = new ArrayList<>();

    public void addElement(DocumentElement element){
        documentElements.add(element);
    }

    public List<DocumentElement> getDocumentElements() {
        return documentElements;
    }
    //    public String render(){
//        StringBuilder result = new StringBuilder();
//        for(DocumentElement documentElement:documentElements){
//            result.append(documentElement.render()).append("\n");
//        }
//        return result.toString();
//    }
}
