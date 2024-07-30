package com.Quiz.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Quiz.Service.QuizService;
import com.Quiz.entities.Quiz;

@RestController
@RequestMapping("/quiz")
public class QuizController {

	private QuizService quizService;

	public QuizController(QuizService quizService) {
		this.quizService = quizService;
	}

	//create 
	@PostMapping
	public Quiz create(@RequestBody Quiz quiz) {
		return quizService.add(quiz);
	}
	
	@GetMapping
	public List<Quiz> getAllQuiz(){
		return quizService.get();
	}
		
	@GetMapping("/{id}")
	public Quiz getone(@PathVariable long id ){
		return quizService.get(id);
	}
	
}
