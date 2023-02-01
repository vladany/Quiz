package com.example.QuizProject.quiz;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuizController {
    @Autowired
    QuizService quizService;

    @PostConstruct
    private void postInit() {
        quizService.createQuestion();
    }

    @GetMapping("/quiz")
    public String quiz(Model model) {
        Quiz quiz = quizService.getQuiz(1);
        model.addAttribute("quiz", quiz);
        return "quiz";
    }
}
