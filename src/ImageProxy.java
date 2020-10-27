
public class ImageProxy implements Element {

    private String url;
    Image realImage=null;

    ImageProxy(String url){
        this.url=url;
    }
    public void printElement(){

        if (realImage==null){
            realImage = new Image(this.url);
        }
        realImage.printElement();
    }

}
