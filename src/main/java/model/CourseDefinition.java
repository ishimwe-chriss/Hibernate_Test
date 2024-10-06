package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Course_Definition")
public class CourseDefinition {

    @Id
    private String code;
    private String name;
    private String description;

    @OneToMany(mappedBy = "courseDefinition", cascade = CascadeType.ALL)
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }
}
