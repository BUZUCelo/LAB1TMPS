public class Main {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(5);
        Square square = new Square(5);
        System.out.println(areaCalculator.areaCal(circle));
        System.out.println(areaCalculator.areaCal(square));
    }
}
