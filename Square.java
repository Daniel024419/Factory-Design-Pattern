public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Square");
    }
}
