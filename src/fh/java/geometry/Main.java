package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.trilateral.RightTriangle;


import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        main.doIt();

    }

    private void doIt() {

        List<GeometricShape> shapeList = new ArrayList<>();

        fillList(shapeList);

        printList(shapeList);

        List<Circle> circleList = new ArrayList<>();

        for (GeometricShape shape : shapeList) {
            if (shape instanceof Circle) {
                circleList.add((Circle)shape);
            }
        }
        System.out.println("------------------------------------------");
        for (Circle circle : circleList) {
            System.out.println(circle);
        }

    }


    public void fillList(List<GeometricShape> shapeList) {

        shapeList.add(new Circle(1,2,3.0));
        shapeList.add(new Circle(1,2,3.1));
        shapeList.add(new Circle(4,2,3.2));
        shapeList.add(new Circle(1,3,12.0));

        shapeList.add(new Rectangle(3,5,5.0,2.0));
        shapeList.add(new Rectangle(3,2,5.0,2.0));
        shapeList.add(new Rectangle(3,5,7.0,2.0));
        shapeList.add(new Rectangle(3,5,8.0,2.0));

        shapeList.add(new RightTriangle(55,44,3.3,2.2));

    }


    public void printList(List<GeometricShape> shapeList) {

        System.out.println("--------- for ----------");
        for (int position = 0; position < shapeList.size(); position++) {
            System.out.println(shapeList.get(position));
        }


        System.out.println("--------- for each ----------");
        for (GeometricShape shape : shapeList) {
            System.out.println(shape);
        }

        System.out.println("--------- stream 1 ----------");
        shapeList.stream()
                .forEach(shape -> System.out.println(shape));


        System.out.println("--------- for ----------");
        shapeList.stream().forEach(System.out::println);

    }

}
