package com.springboot.project.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OptionService {
    @Autowired
    private OptionRepository optionRepository;

    public void save(Option option) { optionRepository.save(option);}

    public Option getOptions(Integer id) {
        optionRepository.findAll();
    }

}
