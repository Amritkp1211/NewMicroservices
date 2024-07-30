package com.Quiz.Service;

import java.util.List;

import com.Quiz.entities.Quiz;

public interface QuizService {

     Quiz add(Quiz quiz);
     
     List<Quiz> get();
     
     Quiz get(Long id);

}
