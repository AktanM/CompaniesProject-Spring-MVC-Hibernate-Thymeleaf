package peaksoft.services;

import peaksoft.entities.Course;

import java.util.List;

public interface CourseService {
    void UpdateCoursesTable(Course course);

    void saveCourses(Course course) ;

    void removeCoursesById(long id);

    List<Course> getAllCourses();

    Course getById(long id);
}
