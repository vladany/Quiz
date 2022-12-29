package com.springboot.project.Joker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokerService {

    @Autowired
    private JokerRepository repo;

    public void addNewJoker(Joker joker){
        repo.save(joker);
    }

    public Joker findeJokerById(Integer id){
        return repo.findById(id).get();
    }

    public void deleteRoleById(Integer id) {
        repo.deleteById(id);
    }


    public void initJokers(){

        Joker
    }

}
