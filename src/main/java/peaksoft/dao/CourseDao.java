package peaksoft.dao;

import org.springframework.stereotype.Repository;
import peaksoft.entities.Course;
import javax.persistence.PersistenceContext;
import java.util.List;
@PersistenceContext
@Repository
public interface CourseDao {

    void UpdateCoursesTable(Course course);

    void saveCourses(Course course);

    void removeCoursesById(long id);

    List<Course> getAllCourses();
    Course getByid(long id);

}
