package doc.BadDesign;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        DocumentEditor documentEditor = new DocumentEditor();
        documentEditor.addText("Hello World!");
        documentEditor.addImage("picture.jpg");
        documentEditor.render();
        documentEditor.save();
    }
}

/* breaking SRP single responsibility principle as a single class is doing many thingS
    add Element , add Image , render , save
    SRP says that a class should only do one thing
    and a class should have only one reason to cheange
    but here class is doing many things and also class have
    many reason to change
*/

/*  breaking OCP open close principle -> OCP says a class should open for extension but
    close for modification when we add new feature we should not make any chenges to
    existing functionality instead we can reuse the existing functionality
 */
