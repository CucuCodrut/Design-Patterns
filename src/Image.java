
public class Image implements Element {
    private String name;

    Image(String name) {
        this.name=name;
    }

    public void  printElement() {
        System.out.println("Image: " + this.name);
    }
}