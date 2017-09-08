package com.springapp.mvc;

import com.springapp.mvc.dao.TestcaseDAO;
import com.springapp.mvc.entity.Testcase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/testcaseController")
public class TestcaseController {
    @Resource
    TestcaseDAO testcaseDAO;


    @RequestMapping(value = "/insert")
    public void insertTestcase(HttpServletRequest request, HttpServletResponse response){
        String id = request.getParameter("id");
        String casecode = request.getParameter("casecode");
        int prio = Integer.parseInt(request.getParameter("prio"));
        //System.out.println("id:"+id+"   casecdode:"+casecode+"    prio:"+prio);
        Testcase testcase = new Testcase();
        testcase.setId1(id);
        testcase.setCasecode1(casecode);
        testcase.setPrio1(prio);
        testcaseDAO.insertTestcase(testcase);
    }
}
