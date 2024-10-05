package model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Semester {
    @Id
    private String id;

    private String name;

    private LocalDate startDate;
    private LocalDate endDate;

    @OneToMany(mappedBy = "semester", cascade = CascadeType.ALL)
    private List<StudentRegistration> registrations;
}
