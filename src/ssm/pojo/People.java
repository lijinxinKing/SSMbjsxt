package ssm.pojo;

import java.util.Set;

public class People {
    private int id;
    private String name;
    private Student student;

    public People(int id, String name, Student student, Teacher teacher, Set<String> sets, int age) {
        this.id = id;
        this.name = name;
        this.student = student;
        this.teacher = teacher;
        this.sets = sets;
        this.age = age;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student=" + student +
                ", teacher=" + teacher +
                ", sets=" + sets +
                ", age=" + age +
                '}';
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    private Teacher teacher;
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    private Set<String>sets;

    public People() {
    }

    public People(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
}
