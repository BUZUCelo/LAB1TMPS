public class AreaCalculator {
    private final static int min = Integer.MIN_VALUE;

    public double areaCal(Shape shape){
        if(shape instanceof Circle){
            return ((Circle) shape).area();
        }
        else if(shape instanceof Square){
            return ((Square) shape).area();
        }
        else{
            return min;
        }
    }

}
