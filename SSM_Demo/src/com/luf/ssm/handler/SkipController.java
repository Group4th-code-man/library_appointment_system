package com.luf.ssm.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//负责页面跳转
@Controller
public class SkipController {

    @RequestMapping(value = "/test")
    public String test()
    {
        return "test";
    }

    @RequestMapping(value = "/login")
    public String login(){return "login";}

    @RequestMapping(value = "/student_homepage")
    public String To_Student_Homepage()
    {
        return "student/student_homepage";
    }

    @RequestMapping(value = "/student_seat")
    public String To_Student_reserve_seat()
    {
        return "student/student_reserve_seat";
    }

    @RequestMapping(value = "/student_room")
    public String To_Student_reserve_room()
    {
        return "student/student_reserve_room";
    }
}
