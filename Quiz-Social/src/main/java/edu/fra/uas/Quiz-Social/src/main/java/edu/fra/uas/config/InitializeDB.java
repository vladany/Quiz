package edu.fra.uas.config;





import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import edu.fra.uas.security.model.Role;
import edu.fra.uas.security.model.User;
import edu.fra.uas.security.repository.UserRepository;
import jakarta.annotation.PostConstruct;

@Component
public class InitializeDB {

    private static final Logger log = LoggerFactory.getLogger(InitializeDB.class);

   
    
    @Autowired
    UserRepository userRepository;
    
    @PostConstruct
    public void init()  {
    	log.debug(" >>> init database");
            
        User user = new User();
        user.setNickname("admin");
        user.setEmail("admin@example.com");
        user.setPassword("admin");
        user.setRole(Role.ADMIN);
        userRepository.save(user);

        user = new User();
        user.setNickname("bob");
        user.setEmail("bob@example.com");
        user.setPassword("bob");
        user.setRole(Role.USER);
        userRepository.save(user);

        user = new User();
        user.setNickname("alice");
        user.setEmail("alice@example.com");
        user.setPassword("alice");
        user.setRole(Role.USER);
    }
}