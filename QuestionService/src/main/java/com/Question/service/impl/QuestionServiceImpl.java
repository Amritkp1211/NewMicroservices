package com.Question.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Question.Repo.QuestionRepo;
import com.Question.entities.Question;
import com.Question.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	QuestionRepo  questionRepo;
	
	public QuestionServiceImpl(QuestionRepo questionRepo) {
		this.questionRepo = questionRepo;
	}

	@Override
	public Question createQuestion(Question question) {
		return questionRepo.save(question);
	}

	@Override
	public Question getbyid(long id) {
		return questionRepo.findById(id).orElseThrow(()-> new RuntimeException("question no found"));
	}

	@Override
	public List<Question> getallQuestion() {
		return questionRepo.findAll();
	}

	@Override
	public List<Question> getQuestionOfQuiz(long quizId) {
		return questionRepo.findByQuizId(quizId);
	}

	
}
