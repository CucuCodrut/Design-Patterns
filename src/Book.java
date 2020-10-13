import java.util.*;

public class Book {
    public String title;
    private TableOfContents tableOfContents;
    private ArrayList <Author> authors=new ArrayList<>();
    public ArrayList <Chapter> chapters=new ArrayList<Chapter>();
    public Book(String title){
        this.title=title;
    }
    public String toString() {
        return "Book{" +
                "title=" + title +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int createChapter(String s) {
        Chapter sub=new Chapter(s);
        chapters.add(sub);
        return chapters.indexOf(sub);
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void print(){
        System.out.println(this.title);
    }

    public void addAuthor(Author rpGheo) {
        authors.add(rpGheo);
    }

    public Chapter getChapter(int indexChapterOne) {
        return chapters.get(indexChapterOne);
    }
}
