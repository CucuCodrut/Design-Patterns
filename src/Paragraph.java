
public class Paragraph implements  Element{
    private String name;
    private AlignStrategy alignStrategy;

    Paragraph(String name) {
        this.name=name;
    }

    public void printElement(){

        if(alignStrategy==null) {
            System.out.println(this.name);
        }else{
            alignStrategy.render(this);
        }
    }
    public String getParagraph(){
        return name;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy){
        this.alignStrategy=alignStrategy;
    }

}