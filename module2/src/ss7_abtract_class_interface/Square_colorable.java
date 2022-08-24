package ss7_abtract_class_interface;

public class Square_colorable extends Square implements Colorable {
    @Override
    public void howToColor() {
        System.out.println(" Color all four sides...");
    }
    public Square_colorable(double side, String color, boolean filled) {
        super(side, color, filled);
    }
}
