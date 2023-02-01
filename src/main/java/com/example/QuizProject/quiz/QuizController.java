package com.example.QuizProject.quiz;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class QuizController {
    @Autowired
    QuizService quizService;

    @PostConstruct
    private void postInit() {
        System.out.println("Initialized");
        quizService.createQuestion();
    }

    @GetMapping("/quiz")
    public String quiz(Model model) {
        Quiz quiz = quizService.getQuiz(1);
        model.addAttribute("quiz", quiz);
        return "quiz";
    }


    @GetMapping("/check")
    @ResponseBody
    public String check(@RequestParam String name) {
        System.out.println("Got the request");
        if (name.equalsIgnoreCase("China")){
            return "Korrekt";
        }
        return "Falsch";
    }
}
