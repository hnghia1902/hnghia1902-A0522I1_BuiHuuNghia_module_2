package ss04_class_object.bai_tap;

import java.util.Scanner;

public class Ptb2 {
    double a,b,c,n,x1,x2;
    public  Ptb2(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public void phuongtrinhbac2(){
        n = getB()*getB() - 4 * getA() * getC();
    }
    public void check(){
        if (n < 0) {
            System.out.print("Phương trình vô nghiệm \n");
        } else if (n == 0) {
            x1 = -b / (2 * a);
            System.out.print("Phương trình có 1 ngiệm là :  " + x1 + "\n");
        } else {
            x1 = (int) ((-b + -Math.sqrt(n)) / (2 * a));
            x2 = (int) ((-b - Math.sqrt(n)) / (2 * a));
            System.out.print("Phương trình có 2 nghiệm phân biệt là : " + "x1 = "+ x1+ "    " +"x2 = "+ x2);
        }
    }

    public static  void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Nhập số a : ");
        double a = input.nextDouble();
        System.out.print("\n Nhập số  b : ");
        double b = input.nextDouble();
        System.out.print("\n Nhập số c : ");
        double c = input.nextDouble();
        Ptb2 ptb2 = new Ptb2(a, b, c);
        ptb2.phuongtrinhbac2();
        ptb2.check();
    }
}
