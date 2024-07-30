package com.Question.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Question.entities.Question;

public interface QuestionRepo extends JpaRepository<Question, Long>  {

	List<Question> findByQuizId(long quizId);
	
}
