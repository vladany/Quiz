package com.example.QuizProject.quiz;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping("/check")
    @ResponseBody
    public String check(@RequestParam String name) {

        // hier muss random passieren

        quizService.getQuiz(1);
        String nameCheck = quizService.getQuiz(1).getOptionRight();
        System.out.println("Got the request");
        if (name.equalsIgnoreCase(nameCheck)){
            return "Korrekt";
        }
        return "Falsch";
    }

    @GetMapping("/check3")
    @ResponseBody
    public String check3(@RequestParam String name) {

        // hier muss random passieren

        quizService.getQuiz(3);
        String nameCheck = quizService.getQuiz(3).getOptionRight();
        System.out.println("Got the request");
        if (name.equalsIgnoreCase(nameCheck)){
            return "Korrekt";
        }
        return "Falsch";
    }


    @GetMapping("/check2")
    @ResponseBody
    public String check2(@RequestParam String name) {

        // hier muss random passieren

        quizService.getQuiz(2);
        String nameCheck = quizService.getQuiz(2).getOptionRight();
        System.out.println("Got the request");
        if (name.equalsIgnoreCase(nameCheck)){
            return "Korrekt";
        }
        return "Falsch";
    }

    @GetMapping("quiz2")
    @ResponseBody
    public Quiz quiz2(@RequestParam(value = "quiz2", required = false, defaultValue = "") Object term) {
        Quiz quiz2 = quizService.getQuiz(2);
        return quiz2;
    }

    @GetMapping("quiz")
    @ResponseBody
    public Quiz quiz(@RequestParam(value = "quiz", required = false, defaultValue = "") Object term) {
        Quiz quiz = quizService.getQuiz(1);
        return quiz;
    }


    @GetMapping("quiz3")
    @ResponseBody
    public Quiz quiz3(@RequestParam(value = "quiz3", required = false, defaultValue = "") Object term) {
        Quiz quiz3 = quizService.getQuiz(3);
        return quiz3;
    }
}