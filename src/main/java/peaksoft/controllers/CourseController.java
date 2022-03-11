package peaksoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import peaksoft.services.CourseServiceImpl;

@Controller
public class CourseController {
    private final CourseServiceImpl courseService;
    @Autowired
    public CourseController(CourseServiceImpl courseService) {
        this.courseService = courseService;
    }
    @GetMapping("/api")
    public String hello(){
        return "course/mainPage";
    }
}
