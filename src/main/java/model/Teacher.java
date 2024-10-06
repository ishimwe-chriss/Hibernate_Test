package model;

import enums.EQualification;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Teacher {
    @Id
    private String code;

    private String name;
    private  String quaification;

    @Enumerated(EnumType.STRING)
    private EQualification qualification;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private List<Courses> courses;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuaification() {
        return quaification;
    }

    public void setQuaification(String quaification) {
        this.quaification = quaification;
    }

    public EQualification getQualification() {
        return qualification;
    }

    public void setQualification(EQualification qualification) {
        this.qualification = qualification;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }
}
