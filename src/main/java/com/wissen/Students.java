package com.wissen;

import java.util.Objects;

public class Students {

    private Integer studentId;
    private String studentName;
    private String studentDob;

    public Students(Integer studentId, String studentName, String studentDob) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentDob = studentDob;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDob() {
        return studentDob;
    }

    public void setStudentDob(String studentDob) {
        this.studentDob = studentDob;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentDob='" + studentDob + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students students)) return false;
        return Objects.equals(getStudentId(), students.getStudentId()) && Objects.equals(getStudentName(), students.getStudentName()) && Objects.equals(getStudentDob(), students.getStudentDob());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentId(), getStudentName(), getStudentDob());
    }
}
