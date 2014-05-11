package com.mallikakiran.welovebrinda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class WhoSaidItActivity extends Activity {

	Button ans_biruntha;
	Button ans_mallika;
	Button ans_kiran;
	TextView quote;
	TextView feedback;
	Button next;

	final String TAG = "WhoSaidItActivity";
	private ArrayList<QuestionItem> questionSet = new ArrayList<QuestionItem>();
	private QuestionItem randomItem;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.who_said_it);

		ans_biruntha = (Button) findViewById(R.id.birunthaa);
		ans_mallika = (Button) findViewById(R.id.mallika);
		ans_kiran = (Button) findViewById(R.id.kiran);
		quote = (TextView) findViewById(R.id.quote);
		feedback = (TextView) findViewById(R.id.feedback);
		next = (Button) findViewById(R.id.next);

		setupQuestionSet();
		displayRandomQuestion();

		next.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				feedback.setText("");
				displayRandomQuestion();
			}
		});

		ans_biruntha.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ans_mallika.setEnabled(false);
				ans_kiran.setEnabled(false);
				questionSet.remove(randomItem);
				if (randomItem.getAnswer().equals("Biruntha")) {
					feedback.setText(randomItem.getCorrect());
				} else {
					feedback.setText(randomItem.getWrong());
				}
				feedback.setVisibility(1);
				next.setEnabled(true);
			}
		});

		ans_mallika.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ans_biruntha.setEnabled(false);
				ans_kiran.setEnabled(false);
				questionSet.remove(randomItem);
				if (randomItem.getAnswer().equalsIgnoreCase("Mallika")) {
					feedback.setText(randomItem.getCorrect());
				} else {
					feedback.setText(randomItem.getWrong());
				}
				feedback.setVisibility(1);
				next.setEnabled(true);
			}
		});

		ans_kiran.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ans_mallika.setEnabled(false);
				ans_biruntha.setEnabled(false);
				questionSet.remove(randomItem);
				if (randomItem.getAnswer().equals("Kiran")) {
					feedback.setText(randomItem.getCorrect());
				} else {
					feedback.setText(randomItem.getWrong());
				}
				feedback.setVisibility(1);
				next.setEnabled(true);
			}
		});
	}

	private void displayRandomQuestion() {
		// TODO Auto-generated method stub
		ans_kiran.setEnabled(true);
		ans_biruntha.setEnabled(true);
		ans_mallika.setEnabled(true);
		next.setEnabled(false);
		if(!questionSet.isEmpty()){
			changeRandomItem();
			quote.setText(randomItem.getQuestion());
		}else{
			Toast.makeText(this, "That's enough questions. get out now", Toast.LENGTH_SHORT).show();
		}
	}

	private void changeRandomItem() {
		// TODO Auto-generated method stub
		randomItem = questionSet.get(new Random().nextInt(questionSet.size()));
	}

	private void setupQuestionSet() {
		// TODO Auto-generated method stub
		AssetManager am = getAssets();
		try {
			InputStream is = am.open("whosays.txt");
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(is));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] item = line.split("\\*");
				QuestionItem tempItem = new QuestionItem(item[0], item[1],
						item[2], item[3]);
				questionSet.add(tempItem);
			}
		} catch (IOException e) {
			Log.i(TAG, "Input file exception");
		}

	}

}
