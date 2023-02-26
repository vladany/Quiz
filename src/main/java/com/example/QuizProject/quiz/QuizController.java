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


    double getRandomQuestionId1 = 1 + (Math.random() * 4);
    int level1 = (int)getRandomQuestionId1;


    double getRandomQuestionId2 = 4 + (Math.random() * 9);
    int level2 = (int)getRandomQuestionId2;


    double getRandomQuestionId3 = 9 + (Math.random() * 14);
    int level3 = (int)getRandomQuestionId3;

    @Autowired
    QuizService quizService;

    @PostConstruct
    private void postInit() {
        System.out.println("Initialized");
        quizService.createQuestion();
    }


    @GetMapping("quiz")
    @ResponseBody
    public Quiz quiz(@RequestParam(value = "quiz", required = false, defaultValue = "") Object term) {
        Quiz quiz = quizService.getQuiz(level1);
        return quiz;
    }

    @GetMapping("quiz2")
    @ResponseBody
    public Quiz quiz2(@RequestParam(value = "quiz2", required = false, defaultValue = "") Object term) {
        Quiz quiz2 = quizService.getQuiz(level2);
        return quiz2;
    }



    @GetMapping("quiz3")
    @ResponseBody
    public Quiz quiz3(@RequestParam(value = "quiz3", required = false, defaultValue = "") Object term) {
        Quiz quiz3 = quizService.getQuiz(level3);
        return quiz3;
    }


    @GetMapping("/check")
    @ResponseBody
    public String check(@RequestParam String name) {

        // hier muss random passieren

        quizService.getQuiz(level1);
        String nameCheck = quizService.getQuiz(level1).getOptionRight();
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

        quizService.getQuiz(level2);
        String nameCheck = quizService.getQuiz(level2).getOptionRight();
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

        quizService.getQuiz(level3);
        String nameCheck = quizService.getQuiz(level3).getOptionRight();
        System.out.println("Got the request");
        if (name.equalsIgnoreCase(nameCheck)){
            return "Korrekt";
        }
        return "Falsch";
    }

}