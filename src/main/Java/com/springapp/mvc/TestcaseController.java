package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/testcaseController")
public class TestcaseController {
    @RequestMapping(value = "/insert")
    public void insertTestcase(HttpServletRequest request, HttpServletResponse response){
        String id = request.getParameter("id");
        String casecode = request.getParameter("casecode");
        int prio = Integer.parseInt(request.getParameter("prio"));
        System.out.println("id:"+id+"   casecdode:"+casecode+"    prio:"+prio);
    }
}
