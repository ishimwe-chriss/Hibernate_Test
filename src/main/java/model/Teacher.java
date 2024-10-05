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
}
