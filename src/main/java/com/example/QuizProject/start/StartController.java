package com.example.QuizProject.tut;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("start")
public class DemoController {

    @RequestMapping()
    public String index() {
        return "start";
    }
}
