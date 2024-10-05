package model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Courses {
    @Id
    private  String code;
    private String name;

    @ManyToOne
    @JoinColumn(name = "course_definition_id")
    private CourseDefinition courseDefinition;

    @ManyToOne
    @JoinColumn(name = "academic_unit_id")
    private AcademicUnit academicUnit;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<StudentCourses> studentCourses;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}

