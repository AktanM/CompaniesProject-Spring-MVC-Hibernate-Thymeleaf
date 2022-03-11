package peaksoft.dao;

import org.springframework.stereotype.Repository;
import peaksoft.entities.Student;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Repository
public class StudentDaoImpl implements StudentDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void UpdateStudentsTable(Student student) {
        entityManager.merge(student);
    }

    @Override
    public void saveStudents(Student student) {
        entityManager.persist(student);
    }

    @Override
    public void removeStudentsById(long id) {
        entityManager.remove(getById(id));
    }

    @Override
    public List<Student> getAllStudents() {
        return entityManager.createQuery("select st from Student st",Student.class).getResultList();
    }

    @Override
    public Student getById(long id) {
        return entityManager.find(Student.class,id) ;
    }
}
