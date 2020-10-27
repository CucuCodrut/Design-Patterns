import java.util.*;
public class Section implements Element {

   String sectionTitle;
   ArrayList<Element> content=new ArrayList<>();
    public Section(String sectionTitle, ArrayList<Element>content){
        this.sectionTitle=sectionTitle;
        this.content = content;
    }
    public Section(String sectionTitle) {
        this.sectionTitle=sectionTitle;
    }

    public void add(Element element){
        content.add(element);

    }


    public void printElement(){
        System.out.println(sectionTitle);
        for (Element element:content){
            element.printElement();
        }

    }

}
