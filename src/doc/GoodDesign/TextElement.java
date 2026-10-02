package doc.GoodDesign;

public class TextElement implements DocumentElement {
    private String text;
    TextElement(String text){
        this.text=text;
    }

    @Override
    public String render(){
        return text;
    }
}
