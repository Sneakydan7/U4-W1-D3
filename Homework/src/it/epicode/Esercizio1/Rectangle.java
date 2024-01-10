package it.epicode.Esercizio1;

public class Rectangle {

    private int height;

    private int width;


    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int rectangleArea(Rectangle rectangle) {
        return rectangle.width * rectangle.height;
    }

    public int rectanglePerimeter(Rectangle rectangle) {
        return (rectangle.width + rectangle.height) * 2;
    }

}
