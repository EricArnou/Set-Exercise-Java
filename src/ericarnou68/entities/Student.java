package ericarnou68.entities;

import java.util.Objects;

public class Student {
    private Integer idStudent;

    public Student(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(getIdStudent(), student.getIdStudent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdStudent());
    }
}
