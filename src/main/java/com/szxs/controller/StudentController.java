package com.szxs.controller;

import com.szxs.entity.JqueryTable;
import com.szxs.entity.Student;
import com.szxs.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController  {
    @Resource
    private StudentService studentService;


    @RequestMapping("/showStudents")
    @ResponseBody
    public Object showStudents(@RequestParam(required = false,defaultValue = "0") int draw,
                               @RequestParam(required = false,defaultValue = "5")int length,
                               @RequestParam(required = false,defaultValue = "0")int start,
                               String userName){
        JqueryTable<Student> studentJqueryTable = studentService.queryStudents(draw, start, length, userName);
        return studentJqueryTable;
    }

    @RequestMapping("/showStudentList")
    public String showStudentList(){
        return "studentList";
    }
}
