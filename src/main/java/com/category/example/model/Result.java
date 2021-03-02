package com.category.example.model;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {

    @JsonProperty("category")
    private String category;

    @JsonProperty("type")
    private String type;

    @JsonProperty("difficulty")
    private String difficulty;
    
    @JsonProperty("question")
    private String question;
    
    @JsonProperty("correct_answer")
    private String correct_answer;
    
    @JsonProperty("incorrect_answers")
    private List<String> incorrect_answers;

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("difficulty")
    public String getDifficulty() {
        return difficulty;
    }

    @JsonProperty("difficulty")
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    @JsonProperty("question")
    public String getQuestion() {
        return question;
    }

    @JsonProperty("question")
    public void setQuestion(String question) {
        this.question = question;
    }

    @JsonProperty("correct_answer")
    public String getCorrect_answer() {
        return correct_answer;
    }

    @JsonProperty("correct_answer")
    public void setCorrect_answer(String correct_answer) {
        this.correct_answer = correct_answer;
    }

    @JsonProperty("incorrect_answers")
    public List<String> getIncorrect_answers() {
        return incorrect_answers;
    }

    @JsonProperty("incorrect_answers")
    public void setIncorrect_answers(List<String> incorrect_answers) {
        this.incorrect_answers = incorrect_answers;
    }

    

}

