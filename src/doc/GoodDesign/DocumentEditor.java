package doc.GoodDesign;

public class DocumentEditor {
    private Document document;

    DocumentEditor(Document document){
        this.document=document;
//        this.persistence=persistence;persistence
    }

    public void addText(String text){
        document.addElement(new TextElement(text));
    }

    public void addImage(String path){
        document.addElement(new ImageElement(path));
    }

//    public String renderDocument(){
//        if(renderedDocument.isEmpty()){
//            renderedDocument=document.render();
//        }
//        return renderedDocument;
//    }

//    public void save() throws IOException {
//        persistence.save(renderedDocument);
//    }
}
