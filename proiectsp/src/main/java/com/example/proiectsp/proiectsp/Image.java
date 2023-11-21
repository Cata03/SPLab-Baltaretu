package proiectsp;
import java.util.concurrent.TimeUnit;
class Image implements Element{
    private String imageName;

    public Image(String imageName)
    {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.imageName = imageName;
    }

    public void print() {
        System.out.println("Image with name: " + imageName);
    }
}