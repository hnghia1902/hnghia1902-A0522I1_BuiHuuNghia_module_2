package ss_06_ke_thua.circle_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5,"red");
        Cylinder cylinder = new Cylinder(5,2.2,"green");
        System.out.println(circle+ "Diện tích hình tròn: "+circle.getArea());
        System.out.println(cylinder+ "thể tích hình trụ: "+cylinder.getVolume());
    }
}
