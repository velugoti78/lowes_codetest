package com.category.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.category.example.model.QuizResponse;
import com.category.example.service.QuizService;

@RestController
@RequestMapping("/coding/exercise")
public class QuizController {

    @Autowired
    QuizService quizService;
    
    @ResponseBody
    @RequestMapping(value = "/quiz", method = RequestMethod.GET, consumes = "application/json")
    public ResponseEntity<QuizResponse> getQuiz() throws Exception {

        return quizService.getQuizResource();
    }

}
