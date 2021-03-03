package day9.Task2;

public class Triangle extends Figure {
    private int lenght1;
    private int lenght2;
    private int lenght3;

    public Triangle(int lenght1, int lenght2, int lenght3,String color) {
        super(color);
        this.lenght1 = lenght1;
        this.lenght2 = lenght2;
        this.lenght3 = lenght3;
    }
    @Override
    public double area() {
        double poluPerimetr = perimeter() / 2;
        return Math.sqrt(poluPerimetr * (poluPerimetr - lenght1) * (poluPerimetr - lenght2) * (poluPerimetr - lenght3));
    }
    @Override
    public double perimeter(){
        return lenght1+lenght2+lenght3;
    }
}
