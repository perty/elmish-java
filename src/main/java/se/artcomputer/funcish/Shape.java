package se.artcomputer.funcish;

// Future Java

class Shape {
    static void testTriangle(Shape s) {
        switch (s) {
            case Triangle t -> {
                if (t.calculateArea() > 100) {
                    System.out.println("Large triangle");
                }
            }
            case Rectangle r -> System.out.println("Rectangle");
            default -> System.out.println("wtf");
        }
    }
}

class Rectangle extends Shape {
}

class Triangle extends Shape {
    int calculateArea() {
        return 0;
    }
}
