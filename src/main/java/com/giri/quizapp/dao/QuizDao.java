package com.giri.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giri.quizapp.model.Quiz;


public interface QuizDao extends JpaRepository<Quiz,Integer> {

}
