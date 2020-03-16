package com.example.tictactoemain;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button[][] button = new Button[3][3];
    private Button reset_Butoon;
    private int roundcount, player1, player2;
    private TextView tplayer1, tplayer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tplayer1 = (TextView)findViewById(R.id.tv1);

    }
}
