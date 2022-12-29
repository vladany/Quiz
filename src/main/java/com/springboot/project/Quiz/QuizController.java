package com.springboot.project.Quiz;

import com.springboot.project.Option.Option;
import com.springboot.project.Option.OptionService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.project.Quiz.QuizService;


@Controller
public class QuizController {
    @Autowired
    QuizService quizService;
    @Autowired
    OptionService optionService;

    @PostConstruct
    private void postInit() {
        quizService.createQuestion();
        optionService.createOption1();
        optionService.createOption2();
        optionService.createOption3();
        optionService.createOption4();

    }


    @GetMapping("/quiz")
    public String quiz(Model model) {
        Quiz quiz = quizService.getQuiz(1);
        Option option1 = optionService.getOption(1);
        Option option2 = optionService.getOption(2);
        Option option3 = optionService.getOption(3);
        Option option4 = optionService.getOption(4);


        model.addAttribute("quiz", quiz);
        model.addAttribute("option1", option1);
        model.addAttribute("option2", option2);
        model.addAttribute("option3", option3);
        model.addAttribute("option4", option4);


        return "quiz";
    }
}
