package peaksoft.services;

import peaksoft.entities.Student;

import java.util.List;

public interface StudentService {
    void UpdateStudentsTable(Student student);

    void saveStudents(Student student);

    void removeStudentsById(long id);

    List<Student> getAllStudents();
    Student getById(long id);

}
