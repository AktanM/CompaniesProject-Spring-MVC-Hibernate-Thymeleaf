package peaksoft.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.dao.TeacherDao;
import peaksoft.entities.Teacher;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherDao teacherDao;

    @Override
    public void UpdateTeachersTable(Teacher teacher) {
        teacherDao.UpdateTeachersTable(teacher);
    }

    @Override
    public void saveTeachers(Teacher teacher) {
        teacherDao.saveTeachers(teacher);
    }

    @Override
    public void removeTeachersById(long id) {
        teacherDao.removeTeachersById(id);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherDao.getAllTeachers();
    }

    @Override
    public Teacher getById(long id) {
        return teacherDao.getById(id);
    }
}