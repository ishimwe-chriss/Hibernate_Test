package model;

import enums.EAcademicUnit;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class AcademicUnit {
    @Id
    private String code;
    private String Name;

    @Enumerated(EnumType.STRING)
    private EAcademicUnit unitType;

    @OneToMany(mappedBy = "academicUnit", cascade = CascadeType.ALL)
    private List<Courses> courses;
}
