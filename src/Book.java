import java.util.ArrayList;

public class Book {
    private String title;

    private ArrayList<Element> content = new ArrayList<>();
    private ArrayList<Author> authors = new ArrayList<>();

    Book(String title){
        this.title=title;
    }

   public void addContent (Element element){
        content.add(element);
   }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public void print(){
        System.out.println("Book name: " + this.title);
        printAuthors();
        for (Element element:content){
            element.printElement();
        }


    }

    private void printAuthors(){
        for(Author i: authors)
        {
            i.print();
        }
    }


}