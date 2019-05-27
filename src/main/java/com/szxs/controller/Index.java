package com.szxs.controller;

import com.szxs.entity.JqueryTable;
import com.szxs.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class Index {
    @RequestMapping("/show")
    public String show(){
        return "index2";
    }


    @RequestMapping("/testPage")
    @ResponseBody
    public Object showPage(@RequestParam(required = false,defaultValue = "0") int draw,
                           @RequestParam(required = false,defaultValue = "0")int length,
                           @RequestParam(required = false,defaultValue = "0")int start,
                           String search,String userName,Integer age){

        //draw 第几页   length每页行数  userName ajax传过来的参数可以多个
        System.out.println("draw:"+draw+"   length:"+length+"    "+search +"  userName:"+userName);
        JqueryTable table = new JqueryTable();
        table.setDraw(draw);
        table.setRecordsTotal(52);
        table.setRecordsFiltered(52);

        List<User> userList = new ArrayList<User>();
        for (int i=1;i<=10;i++){
            userList.add(new User(i,"Tiger Nixon","System Architect","Edinburgh",28,new Date(),"$433,060"));
        }
        System.out.println("进来了");

        table.setData(userList);
        return table;
    }
}
