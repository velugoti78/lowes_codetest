package com.category.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.category.example.client.CategoryClient;
import com.category.example.model.CategoryResponse;
import com.category.example.model.Quiz;
import com.category.example.model.QuizResponse;
import com.category.example.model.QuizResult;
import com.category.example.model.Result;

@Service
public class QuizService {

    @Autowired
    CategoryClient categoryClient;

    private static final Logger logger = LoggerFactory.getLogger(QuizService.class);


    public ResponseEntity<QuizResponse> getQuizResource() throws InterruptedException, ExecutionException {

        CompletableFuture<CategoryResponse> categoryResponse11 = categoryClient.getcategory11();

        CompletableFuture<CategoryResponse> categoryResponse12 = categoryClient.getcategory12();

        CompletableFuture.allOf(categoryResponse11, categoryResponse12).join();

        QuizResponse quizResponse = new QuizResponse();

        List<Result> resultsList = categoryResponse11.get().getResults();
        resultsList.addAll(categoryResponse11.get().getResults());
        quizResponse.quiz = new ArrayList<>();

        for (Result result : resultsList) {
            Quiz quiz = new Quiz();
            quiz.setCategory(result.getCategory());
            quiz.results = new ArrayList<>();
            QuizResult quizResult = new QuizResult();
            quizResult.correct_answer = result.getCorrect_answer();
            quizResult.type = result.getType();
            quizResult.difficulty = result.getDifficulty();
            quizResult.question = result.getQuestion();
            quizResult.all_answers = new ArrayList<>();
            quizResult.all_answers.addAll(result.getIncorrect_answers());
            quizResult.all_answers.add(result.getCorrect_answer());
            quiz.results.add(quizResult);
            quizResponse.quiz.add(quiz);
        }
        return new ResponseEntity<QuizResponse>(quizResponse, HttpStatus.OK);
    }
}
