package com.example.QuizProject.start;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("start")
public class StartController {

    @RequestMapping()
    public String index() {

        return "start";
    }
}
