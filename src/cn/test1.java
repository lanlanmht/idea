package cn;

public class test1 {
    private Preson teaXu;
    private Preson stu;

    public test1(Preson teaXu, Preson stu, String location) {
        this.teaXu = teaXu;
        this.stu = stu;
        this.location = location;
    }

    public Preson getTeaXu() {
        return teaXu;
    }

    public void setTeaXu(Preson teaXu) {
        this.teaXu = teaXu;
    }

    public Preson getStu() {
        return stu;
    }

    public void setStu(Preson stu) {
        this.stu = stu;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public test1() {

    }

    private String location;


}
