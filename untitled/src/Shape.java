public abstract class Shape {

    private String type;

    public Shape(String type)
    {
        this.type = type;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString()
    {
        return "I am a " + type + ".";
    }
}

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(int height, int width)
    {
        this.height = height;
        this.width = width;
    }

    public double getArea()
    {
        return height * width;
    }

    public double getPerimeter()
    {
        return ((height *2) + (width * 2));
    }
}
