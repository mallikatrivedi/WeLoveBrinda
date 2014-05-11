package com.mallikakiran.welovebrinda;

public class QuestionItem {
	
	public enum Person {
	    MALLIKA, TONGTONG, HENRYCHUNG 
	}
	
	private String question;
	private Person answer;
	private String correct;
	private String wrong;
	
	public QuestionItem(String ques, Person ans, String correct, String wrong){
		this.question = ques;
		this.answer = ans;
		this.correct = correct;
		this.wrong = wrong;
	}

	public String getQuestion() {
		return question;
	}

	public Person getAnswer() {
		return answer;
	}

	public String getCorrect() {
		return correct;
	}

	public String getWrong() {
		return wrong;
	}
}
