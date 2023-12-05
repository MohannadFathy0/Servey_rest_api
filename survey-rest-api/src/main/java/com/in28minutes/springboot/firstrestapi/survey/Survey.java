package com.in28minutes.springboot.firstrestapi.survey;

import java.util.List;

public class Survey {

	private String id;
	private String description;
	private String title;
	private List<Question> questions;
	
	public Survey() {
		super();
	}

	public Survey(String id, String description, String title, List<Question> questions) {
		super(); 
		this.id = id;
		this.description = description;
		this.title = title;
		this.questions = questions;
	}

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public String getTitle() {
		return title;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	@Override
	public String toString() {
		return "Survey [id=" + id + ", description=" + description + ", title=" + title + ", questions=" + questions
				+ "]";
	}
}
