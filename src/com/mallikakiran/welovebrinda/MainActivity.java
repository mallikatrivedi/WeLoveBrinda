package com.mallikakiran.welovebrinda;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    public Button whoSaidButton;
    public Button memoryGameButton;
    public Button otherGameButton;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        whoSaidButton = (Button) findViewById(R.id.who_said_it);
        memoryGameButton = (Button) findViewById(R.id.memory_game);
        otherGameButton = (Button) findViewById(R.id.other_games);

        whoSaidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WhoSaidItActivity.class);
                startActivity(intent);
            }
        });

        memoryGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MemoryGameActivity.class);
                startActivity(intent);
            }
        });

        otherGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OtherGamesActivity.class);
                startActivity(intent);
            }
        });
    }
    
}
