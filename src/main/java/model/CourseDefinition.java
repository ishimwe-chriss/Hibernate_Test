package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class CourseDefinition {

    @Id
    private String code;
    private String name;
    private String description;

    @OneToMany(mappedBy = "courseDefinition", cascade = CascadeType.ALL)
    private List<Courses> courses;
}
