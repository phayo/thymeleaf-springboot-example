package com.templates.thymeleaf.controller;

import com.templates.thymeleaf.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class StudentList {

    @RequestMapping("/list")
    public String list(Model model){
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Lewis Ugwu", 86.0));
        list.add(new Student(2, "Franca Eze", 76.0));
        list.add(new Student(3, "Victor Chinewubeze", 86.0));
        model.addAttribute("list", list);

        log.trace("A TRACE Message");
        log.debug("A DEBUG Message");
        log.info("An INFO Message");
        log.warn("A WARN Message");
        log.error("An ERROR Message");

        return "list";
    }
}
