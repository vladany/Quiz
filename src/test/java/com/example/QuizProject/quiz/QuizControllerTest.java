package com.example.QuizProject.quiz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)
@WebMvcTest(QuizController.class)
class QuizControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void quiz() throws Exception{
     /*   RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/quiz");
        MvcResult result = mvc.perform(requestBuilder).andReturn();
        assertEquals(Object quiz, );*/

        mvc.perform(MockMvcRequestBuilders
                        .get("/quiz")
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.quizText").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.optionRight").isNotEmpty());
    }


    @Test
    void quiz2() {
    }

    @Test
    void quiz3() {
    }

    @Test
    void check() {
    }

    @Test
    void check2() {
    }

    @Test
    void check3() {
    }
}