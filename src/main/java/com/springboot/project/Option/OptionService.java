package com.springboot.project.Option;

import com.example.QuizProject.quiz.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OptionService {
    @Autowired
    private OptionRepository optionRepository;

    @Autowired
    private QuizRepository quizRepository;

    public void save(Option option) { optionRepository.save(option);}

    public Option getOption(Integer id) {
        Option option = optionRepository.findById(id).get();
        return option;
    }

    public void createOption1() {
        Option option1 = new Option();
        option1.setId(1);
        option1.setOptionText("Russland");
        optionRepository.save(option1);
    }
    public void createOption2() {
        Option option2 = new Option();
        option2.setId(2);
        option2.setOptionText("China");
        optionRepository.save(option2);
    }
    public void createOption3() {
        Option option3 = new Option();
        option3.setId(3);
        option3.setOptionText("Kanada");
        optionRepository.save(option3);
    }
    public void createOption4() {
        Option option4 = new Option();
        option4.setId(4);
        option4.setOptionText("USA");
        optionRepository.save(option4);
    }

    public String checkAnswer() {
        String x = "check";


        return x;
    }
}
