public class MainDemo {
    
    public static void main(String[] args) {

        AbstractFactory abstractFactory = FactoryProducer.getFactory("Shape");
        Shape shape1 = abstractFactory.getShape("Rectangle");
        shape1.draw();
    }
}
