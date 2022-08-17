package ss_05_accessmodifier_staticmethod_staticproperty.bai_tap;

public class Student {
    private String name = "john";
    private String _class = "C02";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }


    public static void main(String[] args) {
        Student Test = new Student();
        String name = "Bùi Hữu Nghĩa";
        Test.setName(name);
        String _class = "A0522I1";
        Test.set_class(_class);
        System.out.println(Test.name);
        System.out.println(Test._class);


    }
}
