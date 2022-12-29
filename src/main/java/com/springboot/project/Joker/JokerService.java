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

        Joker fiftyFiftyJoker = new Joker();
        fiftyFiftyJoker.setId(1);
        fiftyFiftyJoker.setJokerTyp("50 / 50");
        fiftyFiftyJoker.setJokerDescription("This Joker eliminates 2 wrong Questions");
        fiftyFiftyJoker.setUsed(false);
        repo.save(fiftyFiftyJoker);

        Joker audienceJoker = new Joker();
        audienceJoker.setId(1);
        audienceJoker.setJokerTyp("Ask the Audience");
        audienceJoker.setJokerDescription("This Joker shows the question with the highest possibility");
        audienceJoker.setUsed(false);
        repo.save(audienceJoker);

        Joker phoneAFriendJoker = new Joker();
        phoneAFriendJoker.setId(1);
        phoneAFriendJoker.setJokerTyp("Phone a Friend");
        phoneAFriendJoker.setJokerDescription("This Joker gives you the right answer");
        phoneAFriendJoker.setUsed(false);
        repo.save(phoneAFriendJoker);


    }

}
