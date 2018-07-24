package com.textgame.joshuas.textgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Gameplay extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        GameData.BuildData();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), GameData.currentLocation.actions.get(0).actionText, Toast.LENGTH_LONG).show();
                GameEngine.navigate(0);
                loadEncounterInfo();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), GameData.currentLocation.actions.get(1).actionText, Toast.LENGTH_LONG).show();
                GameEngine.navigate(1);
                loadEncounterInfo();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), GameData.currentLocation.actions.get(2).actionText, Toast.LENGTH_LONG).show();
                GameEngine.navigate(2);
                loadEncounterInfo();
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), GameData.currentLocation.actions.get(3).actionText, Toast.LENGTH_LONG).show();
                GameEngine.navigate(3);
                loadEncounterInfo();
            }
        });


        loadEncounterInfo();
    }
    protected void loadEncounterInfo(){
        ((TextView)findViewById(R.id.overView)).setText(GameData.currentLocation.name);
        ((TextView)findViewById(R.id.textView)).setText(GameData.currentLocation.description);

        switch (GameData.currentLocation.actions.size()){
            case 4:
                button4.setEnabled(true);
                button4.setText(GameData.currentLocation.actions.get(3).description);
                button3.setEnabled(true);
                button3.setText(GameData.currentLocation.actions.get(2).description);
                button2.setEnabled(true);
                button2.setText(GameData.currentLocation.actions.get(1).description);
                button1.setEnabled(true);
                button1.setText(GameData.currentLocation.actions.get(0).description);
                break;
            case 3:
                button4.setEnabled(false);
                button4.setText("");
                button3.setEnabled(true);
                button3.setText(GameData.currentLocation.actions.get(2).description);
                button2.setEnabled(true);
                button2.setText(GameData.currentLocation.actions.get(1).description);
                button1.setEnabled(true);
                button1.setText(GameData.currentLocation.actions.get(0).description);
                break;
            case 2:
                button4.setEnabled(false);
                button4.setText("");
                button3.setEnabled(false);
                button3.setText("");
                button2.setEnabled(true);
                button2.setText(GameData.currentLocation.actions.get(1).description);
                button1.setEnabled(true);
                button1.setText(GameData.currentLocation.actions.get(0).description);
                break;
            case 1:
                button4.setEnabled(false);
                button4.setText("");
                button3.setEnabled(false);
                button3.setText("");
                button2.setEnabled(false);
                button2.setText("");
                button1.setEnabled(true);
                button1.setText(GameData.currentLocation.actions.get(0).description);
                break;
            default:
                button4.setEnabled(false);
                button4.setText("");
                button3.setEnabled(false);
                button3.setText("");
                button2.setEnabled(false);
                button2.setText("");
                button1.setEnabled(false);
                button1.setText("");
                break;

        }
    }

}
