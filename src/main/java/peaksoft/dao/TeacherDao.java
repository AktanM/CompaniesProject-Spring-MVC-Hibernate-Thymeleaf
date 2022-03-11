package peaksoft.dao;

import peaksoft.entities.Teacher;

import java.util.List;

public interface TeacherDao {
    void UpdateTeachersTable(Teacher teacher);

    void saveTeachers(Teacher teacher);

    void removeTeachersById(long id);

    List<Teacher> getAllTeachers();

    Teacher getById(long id);
}
