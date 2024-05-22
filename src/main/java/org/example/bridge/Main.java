package org.example.bridge;

public class Main {
    public static void main(String[] args) {
        Shape shapeTriangle = new Triangle(new ColorRed());
        shapeTriangle.applyShapeColor();

        Shape pentagonShape = new Pentagon(new ColorGreen());
        pentagonShape.applyShapeColor();

        Shape shapeTriangle2 = new Triangle(new Color() {
            @Override
            public void applyColor() {
                System.out.println("Yellow");
            }
        });
        shapeTriangle2.applyShapeColor();
    }
}
