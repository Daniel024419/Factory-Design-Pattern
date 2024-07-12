public  class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

    @Override
    public void erase() {
        System.out.println("Inside Rectangle::erase() method.");
    }
    
}
