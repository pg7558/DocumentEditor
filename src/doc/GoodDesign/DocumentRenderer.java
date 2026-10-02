package doc.GoodDesign;

import java.util.List;

public class DocumentRenderer {
    private Document document;
    private String renderedDocument="";
    DocumentRenderer(Document document){
        this.document=document;
    }

    public String render(){
        if(renderedDocument.isEmpty()) {
            StringBuilder result=new StringBuilder();
            List<DocumentElement> documentElements = document.getDocumentElements();
            for (DocumentElement documentElement : documentElements) {
                result.append(documentElement.render()).append("\n");
            }
            renderedDocument=result.toString();
        }
        return renderedDocument;
    }
}
