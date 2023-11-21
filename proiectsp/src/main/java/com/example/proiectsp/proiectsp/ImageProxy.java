package proiectsp;

class ImageProxy implements Element {
    private Image realImage; // Reference to the real Image
    private String imageName;

    public ImageProxy(String imageName) {
        this.imageName = imageName;
    }

    public void print() {
        // Load the real Image only when needed
        if (realImage == null) {
            realImage = new Image(imageName);
        }
        realImage.print();
    }
}
