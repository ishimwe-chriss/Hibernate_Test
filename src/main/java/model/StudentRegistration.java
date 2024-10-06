package model;

import enums.EAcademicUnit;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Set;


@Entity
public class StudentRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String studentId;
    private LocalDate regDate;

    @Enumerated(EnumType.STRING)
    @JoinColumn(name = "department_id")
    private EAcademicUnit department;


    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name="semester_id")
    private Semester semester;

    @ManyToMany
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "registration_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<Courses> courses;


}
