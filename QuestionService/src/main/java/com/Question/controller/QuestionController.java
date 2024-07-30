package com.Question.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Question.entities.Question;
import com.Question.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	private QuestionService questionService;

	public QuestionController(QuestionService questionService) {
		this.questionService = questionService;
	}

	@PostMapping
	public Question saveQuestion(@RequestBody Question question) {
	return	questionService.createQuestion(question);
	}
	

	@GetMapping("/{id}")
	public Question getoneQuestion(@PathVariable long id) {
	return	questionService.getbyid(id);
	}
	
	@GetMapping
	public List<Question> getAllQuestion() {
	return	questionService.getallQuestion();
	}
	
	@GetMapping("/quiz/{quizId}")
	public List<Question> getQuestionsOfQuiz(@PathVariable long quizId){
		return questionService.getQuestionOfQuiz(quizId);
	}
	
	
	
}
