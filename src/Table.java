public class Table implements  Element{

    private String name;

    Table(String name) {
        this.name=name;
    }

    public void printElement() {
        System.out.println("Table: " + this.name);
    }
}