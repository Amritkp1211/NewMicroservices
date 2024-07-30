package com.Question.service;

import java.util.List;

import com.Question.entities.Question;

public interface QuestionService {

	//create question
	Question createQuestion(Question question);
	
	//find by id 
	Question getbyid(long id );
	
	//get all question
	List<Question> getallQuestion();
	
	//get question by quizid
	List<Question> getQuestionOfQuiz(long quizId);
}
