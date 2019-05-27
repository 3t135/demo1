package com.szxs.service;

import com.szxs.entity.JqueryTable;
import com.szxs.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {

    JqueryTable<Student> queryStudents(int draw,int pageNo, int pageSize, String uname);

}
