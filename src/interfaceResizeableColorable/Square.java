package interfaceResizeableColorable;

public class Square extends Shape implements Resizeable, Colorable {
    private double side;
    public Square() {
    }
    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public void resize(double percent) {
        side *= percent;
        System.out.println(this.toString() + " Area after resize: " + this.getArea());
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + getArea() +
                '}';
    }
}
