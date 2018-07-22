package com.textgame.joshuas.textgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Gameplay extends AppCompatActivity {
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        GameData.BuildData();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);

        button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadEncounterInfo(view);
            }
        });
    }
    protected void loadEncounterInfo(View view){
        ((TextView)findViewById(R.id.overView)).setText(GameData.currentLocation.name);
        ((TextView)findViewById(R.id.textView)).setText(GameData.currentLocation.description);
    }
}
