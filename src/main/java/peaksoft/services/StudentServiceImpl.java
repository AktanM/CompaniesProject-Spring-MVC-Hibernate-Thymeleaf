package peaksoft.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.dao.StudentDao;
import peaksoft.entities.Student;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public void UpdateStudentsTable(Student student) {
        studentDao.UpdateStudentsTable(student);
    }

    @Override
    public void saveStudents(Student student) {
        studentDao.saveStudents(student);
    }

    @Override
    public void removeStudentsById(long id) {
        studentDao.removeStudentsById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @Override
    public Student getById(long id) {
        return studentDao.getById(id);
    }
}