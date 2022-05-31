package chapter6;

public class Rectangle {

    private double length;
    private double width;

    //Constructor
    public Rectangle(){
        length = 0;
        width = 0;
    }

    //Constructor with 2 parameters
    public Rectangle(double length, double width){
        this.length = length; // can be set this way
        setWidth(width); //or can be set this way. these are only different here to demo alternative option
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
}
