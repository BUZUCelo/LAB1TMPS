public class Circle implements Shape{
    private final int r;
    public Circle(int r) {
        this.r = r;
    }
    @Override
    public double area(){
        return r*r*Math.PI;
    }
}
