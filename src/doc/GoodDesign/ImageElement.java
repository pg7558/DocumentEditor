package doc.GoodDesign;

public class ImageElement implements DocumentElement {
    String path;
    ImageElement(String path){
        this.path=path;
    }

    @Override
    public String render(){
        return "[Image : "+path+"]";
    }
}
