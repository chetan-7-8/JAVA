package section6;

public class RectangleDemo {
    public static void main(String args[]){
        Rectangle r = new Rectangle();
        Rectangle r2 = new Rectangle(5,10);

        System.out.println("Number of rectangles are "+Rectangle.getNumRectangles());
        System.out.println(r2.area());
    }
}
