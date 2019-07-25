package cn.javabean;

public class Andios {
    private Preson teaXu;
    private Preson stu;

    public Andios(Preson teaXu, Preson stu, String location) {
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

    public Andios() {

    }

    private String location;


}
