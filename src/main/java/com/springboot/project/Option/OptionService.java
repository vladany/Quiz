package com.springboot.project.Option;

import com.springboot.project.Quiz.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OptionService {
    @Autowired
    private OptionRepository optionRepository;

    public void save(Option option) { optionRepository.save(option);}

    public Option getOption(Integer id) {
        Option option = optionRepository.findAll().get(id);
        return option;
    }

    public selectOption()

}
