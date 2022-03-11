package peaksoft.dao;

import org.springframework.stereotype.Repository;
import peaksoft.entities.Course;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@PersistenceContext
@Repository
public class CourseDaoImpl implements CourseDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void UpdateCoursesTable(Course course) {
        entityManager.merge(course);
    }

    @Override
    public void saveCourses(Course course) {
        entityManager.persist(course);
    }

    @Override
    public void removeCoursesById(long id) {
        entityManager.remove(getByid(id));
    }

    @Override
    public List<Course> getAllCourses() {
        return entityManager.createQuery("select c from Course c", Course.class).getResultList();
    }

    @Override
    public Course getByid(long id) {
        return entityManager.find(Course.class, id);
    }
}
