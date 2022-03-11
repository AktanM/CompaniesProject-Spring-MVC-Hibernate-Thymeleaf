package peaksoft.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.dao.CourseDao;
import peaksoft.entities.Course;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;

    @Override
    public void saveCourses(Course course) {
        courseDao.saveCourses(course);
    }

    @Override
    public Course getById(long id) {
        return courseDao.getByid(id);
    }

    @Override
    public void UpdateCoursesTable(Course course) {
        courseDao.UpdateCoursesTable(course);
    }

    @Override
    public void removeCoursesById(long id) {
        courseDao.removeCoursesById(id);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseDao.getAllCourses();
    }
}