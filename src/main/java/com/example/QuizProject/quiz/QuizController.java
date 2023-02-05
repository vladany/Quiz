package com.example.QuizProject.quiz;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class QuizController {


    double getRandomQuestionId = 1 + (Math.random() * 5);
    int i = (int)getRandomQuestionId;
    @Autowired
    QuizService quizService;

    @PostConstruct
    private void postInit() {
        System.out.println("Initialized");
        quizService.createQuestion();
    }

    @GetMapping("/quiz")
    public String quiz(Model model) {

        Quiz quiz = quizService.getQuiz(2);
        model.addAttribute("quiz", quiz);
        return "quiz";
    }

    @GetMapping("/check")
    @ResponseBody
    public String check(@RequestParam String name) {

        // hier muss random passieren

        quizService.getQuiz(4);
        String nameCheck = quizService.getQuiz(4).getOptionRight();
        System.out.println("Got the request");
        if (name.equalsIgnoreCase(nameCheck)){
            return "Korrekt";
        }
        return "Falsch";
    }

    @GetMapping("quiz1")
    @ResponseBody
    public Quiz quiz1(@RequestParam(value = "quiz1", required = false, defaultValue = "") Object term) {
        Quiz quiz1 = quizService.getQuiz(3);
        return quiz1;
    }


}
