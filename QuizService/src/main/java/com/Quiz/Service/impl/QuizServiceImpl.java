package com.Quiz.Service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Quiz.Service.QuestionClient;
import com.Quiz.Service.QuizService;
import com.Quiz.entities.Quiz;
import com.Quiz.repo.QuizRepo;

@Service
public class QuizServiceImpl implements QuizService {

	private QuizRepo quizRepo;

	
	private QuestionClient questionClient;
	
	public QuizServiceImpl(QuizRepo quizRepo, QuestionClient questionClient) {
		this.quizRepo = quizRepo;
		this.questionClient = questionClient;
	}

	@Override
	public Quiz add(Quiz quiz) {
		return quizRepo.save(quiz);
	}

	@Override
	public List<Quiz> get() {

		List<Quiz> quizzez = quizRepo.findAll();
		
		List<Quiz> newQuizlist = quizzez.stream().map(quiz ->{
			quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
			return quiz;
		}).collect(Collectors.toList());
		
		return newQuizlist;
	}

	@Override
	public Quiz get(Long id) {
		 Quiz quiz = quizRepo.findById(id).orElseThrow(() -> new RuntimeException("quiz not found"));
		     quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
		 return quiz;
	}

}
