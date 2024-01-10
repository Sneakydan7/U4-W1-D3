package it.epicode.Esercizio1;


public class MainRettangolo {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 6);
        Rectangle rectangle2 = new Rectangle(10, 15);

        System.out.println(printRectangle(rectangle1));
        System.out.println(printTwoRectangles(rectangle1, rectangle2));

    }

    public static String printRectangle(Rectangle rectangle) {
        return ("l'area del rettangolo è " + rectangle.rectangleArea(rectangle) + "e il perimetro è" + rectangle.rectanglePerimeter(rectangle));
    }

    public static String printTwoRectangles(Rectangle rec1, Rectangle rec2) {
        return ("l'area del primo rettangolo è" + rec1.rectangleArea(rec1) + "e il perimetro è" + rec1.rectanglePerimeter(rec1) +
                "||l'area del secondo rettangolo è" + rec2.rectangleArea(rec2) + "e il perimetro è" + rec2.rectanglePerimeter(rec2) + "||la somma delle aree dei rettangoli è" + (rec1.rectangleArea(rec1) + rec2.rectangleArea(rec2)) + "e la somma dei perimetri è" + (rec1.rectanglePerimeter(rec1) + rec2.rectanglePerimeter(rec2)));
    }

}