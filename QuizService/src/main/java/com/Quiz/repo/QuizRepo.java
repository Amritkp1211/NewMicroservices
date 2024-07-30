package com.Quiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Quiz.entities.Quiz;

@Repository
public interface QuizRepo extends JpaRepository<Quiz,Long>{

	
}
