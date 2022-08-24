package ss7_abtract_class_interface;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}
