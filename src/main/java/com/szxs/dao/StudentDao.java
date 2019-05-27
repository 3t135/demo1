package com.szxs.dao;

import com.szxs.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {

    List<Student> queryStudents(@Param("offset") int offset, @Param("pageSize")int pageSize,@Param("uname") String uname);

    int queryStudentsRows(@Param("uname")String uname);


}
