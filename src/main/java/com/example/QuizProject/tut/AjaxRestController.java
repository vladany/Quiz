package com.example.QuizProject.tut;


import org.springframework.http.*;
import org.springframework.util.*;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("api/ajaxrest")
public class AjaxRestController {


    // http://localhost:9596/api/ajaxrest/demo1 zeigt demo1 text an
    @RequestMapping(value = "demo1",
            method = RequestMethod.GET,
            produces = {MimeTypeUtils.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> demo() {
        try {
            ResponseEntity<String> responseEntity =
                    new ResponseEntity<String>("DEMO 1", HttpStatus.OK);
            return responseEntity;
        } catch (Exception e) {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
    }

    //demo 2
    @RequestMapping(value = "demo2/{fullName}",
            method = RequestMethod.GET,
            produces = {MimeTypeUtils.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> demo2
    (@PathVariable("fullName") String fullName) {
        try {
            ResponseEntity<String> responseEntity =
                    new ResponseEntity<String>("Hi " + fullName, HttpStatus.OK);
            return responseEntity;
        } catch (Exception e) {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
    }

}
