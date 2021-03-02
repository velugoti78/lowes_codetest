package com.category.example.model;

import java.util.List;

public class CategoryResponse {

    public int response_code;
    
    public List<Result> results;

    public int getResponse_code() {
        return response_code;
    }

    public void setResponse_code(int response_code) {
        this.response_code = response_code;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
     
}
