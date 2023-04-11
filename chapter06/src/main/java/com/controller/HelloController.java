package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

   @RequestMapping(value="/hello.do", method=RequestMethod.GET)
   public ModelAndView hello() { //Spring Container에 의해 호출되는 Callback Method
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.addObject("result", "Hello Spring"); //request.setAttribute("result", "Hello Spring")와 같은 개념
      //modelAndView.setViewName("hello"); //파일명 지정
      modelAndView.setViewName("/view/hello"); // 폴더/파일명 지정
      
      return modelAndView;
   }   
   @RequestMapping(value="/hello2.do",method=RequestMethod.GET)
   public ModelAndView hello2() {
	   ModelAndView modelAndView = new ModelAndView();
	   modelAndView.addObject("result2", "Have a nice day!!"); //request.setAttribute("result", "Hello Spring")와 같은 개념
	   modelAndView.setViewName("/WEB-INF/view2/hello2"); // 폴더/파일명 지정
	   //http://localhost:8080/chapter06/WEB-INF/view2/hello2.jsp 호출이 안된다
	   return modelAndView;
   }
   @RequestMapping(value="/hello3.do",method=RequestMethod.GET, produces = "text/html; charset=UTF-8")
   @ResponseBody // 단순문자열이 된다.
   public String hello3() {
	   return "안녕하세요";//파일명 Welcome.jsp로 인식
   }
   //스프링에서는 return타입이 String이면 단순 문자열이 아니라 파일명으로 인식
   // 스프링은 Welcome.jsp 파일을 찾는다
   //만약 단순 문자열로 웹 브라우저에 나타내려면 @ResponseBody를 써야한다.
   
}

/*
Callback Method: 어떤 이벤트에 의해 호출되는 메소드

http://localhost:8080/Context명(Project명)/hello.do 요청
DispatcherServlet 
     ↕ HandlerMapping
HelloController.java
 */