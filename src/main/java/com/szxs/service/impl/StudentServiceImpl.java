package com.szxs.service.impl;

import com.szxs.dao.StudentDao;
import com.szxs.entity.JqueryTable;
import com.szxs.entity.Student;
import com.szxs.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    public JqueryTable<Student> queryStudents(int draw,int pageNo, int pageSize, String uname) {
        JqueryTable<Student> studentTable = new JqueryTable<Student>();
        studentTable.setRecordsTotal(studentDao.queryStudentsRows(uname));
        studentTable.setRecordsFiltered(studentTable.getRecordsTotal());

        studentTable.setDraw(draw);
        studentTable.setData(studentDao.queryStudents( pageNo,pageSize,uname));
        return studentTable;
    }
}
