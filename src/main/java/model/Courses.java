package model;

import enums.EAcademicUnit;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "Course")
public class Courses {
    @Id
    private  String code;
    private String name;

    @ManyToOne
    @JoinColumn(name = "semester_id")
    private Semester semester;

    @Enumerated(EnumType.STRING)
    @JoinColumn(name = "department_id")
    private EAcademicUnit department;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<CourseDefinition> courseDefinitions;

    @ManyToMany(mappedBy = "courses")
    private List<StudentRegistration> registrations;

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

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public EAcademicUnit getDepartment() {
        return department;
    }

    public void setDepartment(EAcademicUnit department) {
        this.department = department;
    }

    public List<CourseDefinition> getCourseDefinitions() {
        return courseDefinitions;
    }

    public void setCourseDefinitions(List<CourseDefinition> courseDefinitions) {
        this.courseDefinitions = courseDefinitions;
    }

    public List<StudentRegistration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<StudentRegistration> registrations) {
        this.registrations = registrations;
    }
}

