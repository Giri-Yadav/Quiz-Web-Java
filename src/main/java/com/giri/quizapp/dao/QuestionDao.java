package com.giri.quizapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.giri.quizapp.model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

		List<Question> findByCategory(String category);
		@Query(value = "SELECT * FROM question q Where q.category=?1 ORDER BY RAND() LIMIT ?2", nativeQuery = true)
		List<Question> findRandomQuestionsByCategory(String category, int numQ);
}
