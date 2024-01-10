package it.epicode.Esercizio1;


public class MainRettangolo {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 6);
        Rectangle rectangle2 = new Rectangle(10, 15);

        System.out.println(printRectangle(rectangle1));
        System.out.println(printTwoRectangles(rectangle1, rectangle2));


    }

    public static String printRectangle(Rectangle rectangle) {
        return String.format("l'area del rettangolo è %s e il perimetro è %s",
                rectangle.rectangleArea(rectangle),
                rectangle.rectanglePerimeter(rectangle));

    }

    public static String printTwoRectangles(Rectangle rec1, Rectangle rec2) {

        return String.format("l'area del primo rettangolo è %s e il perimetro è %s %n " +
                        "l'area del secondo rettangolo è %s e il perimetro è %s %n" +
                        "la somma delle aree dei rettangoli è %s e la somma dei perimetri è %s",
                rec1.rectangleArea(rec1), rec1.rectanglePerimeter(rec1),
                rec2.rectangleArea(rec2), rec2.rectangleArea(rec2),
                rec1.rectangleArea(rec1) + rec2.rectangleArea(rec2),
                rec1.rectanglePerimeter(rec1) + rec2.rectanglePerimeter(rec2)

        );


    }


}