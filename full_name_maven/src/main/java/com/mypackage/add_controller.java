package com.mypackage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class add_controller {
@RequestMapping("/add")
ModelAndView add (HttpServletRequest request, HttpServletResponse response)
{
String first_name= request.getParameter("first_name");
String second_name = request.getParameter("second_name");
String full_name= first_name+" "+second_name;
ModelAndView mv= new ModelAndView();
mv.setViewName("result.jsp");
mv.addObject("result", full_name);
return mv;
}
}