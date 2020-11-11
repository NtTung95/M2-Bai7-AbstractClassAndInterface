package interfaceResizeableColorable;

public class Main {
    public static void main(String[] args) {
        Shape[] listShape = new Shape[3];
        listShape[0] = new Circle(5);
        listShape[1] = new Rectangle(4,5);
        listShape[2] = new Square(4);

        for (Shape shape: listShape){
            double x = Math.floor((Math.random() * 100) + 1);
            System.out.println(shape);
            shape.resize(x);

            if(shape instanceof Square){
                ((Square) shape).howToColor();
            }
        }
    }
}
