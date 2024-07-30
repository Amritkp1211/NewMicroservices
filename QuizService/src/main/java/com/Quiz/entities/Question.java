package com.Quiz.entities;


import lombok.Data;

@Data
public class Question {
	
	private long questionId;
	
	private String question;
	
	private long quizId;
}
