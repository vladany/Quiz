package com.springboot.project.Quiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/demo")
public class JavaScriptTestController {

    @RequestMapping("/mypage")
    public String showPage(Model model) {
        model.addAttribute("mykey", "myvalue");
        ArrayList myList = new ArrayList();

        Person p = new Person();
        p.setName("John");
        p.setAge("12");

        myList.add(p);

        Person p2 = new Person();
        p2.setName("Tom");
        p2.setAge("34");

        myList.add(p2);

        model.addAttribute("myList", myList);


        return "mypage";
    }
}
