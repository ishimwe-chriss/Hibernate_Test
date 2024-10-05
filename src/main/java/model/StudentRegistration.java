package model;

import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
public class StudentRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String studentId;
    private LocalDate regDate;

    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name="semester_id")
    private Semester semester;


}
