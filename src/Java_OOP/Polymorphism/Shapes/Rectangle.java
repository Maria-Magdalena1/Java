package Java_OOP.Polymorphism.Shapes;

public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.setHeight(height);
       this.setWidth(width);
        calculatePerimeter();
        calculateArea();
    }

    public double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    @Override
    protected void calculatePerimeter() {
        super.setPerimeter(this.height * 2 + this.width * 2);
    }

    @Override
    protected void calculateArea() {
        super.setArea(this.height * this.width);
    }
}
