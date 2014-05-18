package com.mallikakiran.welovebrinda;

public class QuestionItem {
	
	private String question;
	private String answer;
	private String correct;
	private String wrong;
	
	public QuestionItem(String ques, String ans, String correct, String wrong){
		this.question = ques;
		this.answer = ans;
		this.correct = correct;
		this.wrong = wrong;
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return answer;
	}

	public String getCorrect() {
		return correct;
	}

	public String getWrong() {
		return wrong;
	}
}
