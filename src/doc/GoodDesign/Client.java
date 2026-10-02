package doc.GoodDesign;

import java.io.IOException;

public class Client {
    public static void main(String args[]) throws IOException {
        Document document=new Document();
        Persistence persistence=new FileStorage();
        DocumentRenderer documentRenderer = new DocumentRenderer(document);

        DocumentEditor documentEditor=new DocumentEditor(document);
        documentEditor.addText("Hello!World");
        documentEditor.addImage("picture.jpg");
        String renderedDocument = documentRenderer.render();
        persistence.save(renderedDocument);
    }
}

/* this is the perfect design but it is breaking principle of least knowldge
   principle of least knowldge says that a object should only interact with the object
   which is directly connected to it but here document renderer is interacting with
   DocuementElement class which is not directly connected to this
 */
