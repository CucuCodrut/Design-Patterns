
public class Paragraph implements  Element{
    private String name;

    Paragraph(String name) {
        this.name=name;
    }

    public void printElement() {
        System.out.println("Paragraph: " + this.name);
    }
}