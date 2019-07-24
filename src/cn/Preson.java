package cn;

public class Preson {
    private String name;
    private Integer age;
    private Integer sex;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Preson() {
    }

    public Preson(String name, Integer age, Integer sex) {

        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Integer getSex() {
        return sex;

    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
