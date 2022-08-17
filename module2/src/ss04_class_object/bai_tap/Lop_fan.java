package ss04_class_object.bai_tap;

public class Lop_fan {
    private static final int LOW = 1;
    private static final int MEDIUM  = 2;
    private static final int FAST = 3;
    private int speed = LOW;
    private boolean on= false;
    private String color = "blue";
    private double radius = 5;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Lop_fan(int speed,boolean on,String color,double radius){
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }
    public String toString(){
        String state = "";
        if(this.on){
            state+=" Speed : "+ this.speed+"\n Color : "+ this.color +"\n Radius : "+ this.radius+"\n Fan is on";
        }
        else{
            state+=" Color : "+ this.color+ "\n Radius : "+ this.radius+"\n Fan is off";
        }
        return state;
    }

    public static void main(String[] args) {
        Lop_fan fan1 = new Lop_fan (FAST,true,"Yellow",10);
        Lop_fan fan2 = new Lop_fan(MEDIUM,false,"blue",5);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
