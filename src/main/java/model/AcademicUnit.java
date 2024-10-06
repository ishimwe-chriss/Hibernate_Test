package model;

import java.util.UUID;

import enums.EAcademicUnit;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;


@Entity
public class AcademicUnit {
    @Id
    @Column(name="id")
    private UUID academicId = UUID.randomUUID();

    private String AcademicUnitcode;
    private String AcademicUnitName;

    @Enumerated(EnumType.STRING)
    private EAcademicUnit unitType;

    @Column(name="parent_id", nullable=true)
    private UUID parentId;

    

    public UUID getAcademicId() {
        return academicId;
    }

    public void setAcademicId(UUID academicId) {
        this.academicId = academicId;
    }

    public String getAcademicUnitcode() {
        return AcademicUnitcode;
    }

    public void setAcademicUnitcode(String academicUnitcode) {
        AcademicUnitcode = academicUnitcode;
    }

    public String getAcademicUnitName() {
        return AcademicUnitName;
    }

    public void setAcademicUnitName(String academicUnitName) {
        AcademicUnitName = academicUnitName;
    }

    public EAcademicUnit getUnitType() {
        return unitType;
    }

    public void setUnitType(EAcademicUnit unitType) {
        this.unitType = unitType;
    }

    public UUID getParentId() {
        return parentId;
    }

    public void setParentId(UUID parentId) {
        this.parentId = parentId;
    }

    


}
