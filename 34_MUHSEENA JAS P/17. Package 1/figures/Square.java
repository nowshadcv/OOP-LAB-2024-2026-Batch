package figures;

public class Square implements FiguresSq {
    private double side;

    public Square(double s) {
        side = s;
    }

    public double perimeter() {
        return 4 * side;
    }

    public double area() {
        return side * side;
    }
}
