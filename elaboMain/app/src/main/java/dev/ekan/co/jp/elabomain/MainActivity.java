package dev.ekan.co.jp.elabomain;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_changeColor = (Button) findViewById(R.id.button1);
        Button btn_changeText = (Button) findViewById(R.id.button2);
        final Button btn_android = (Button) findViewById(R.id.button3);
        final TextView textView = (TextView) findViewById(R.id.textview);

        btn_changeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setBackgroundColor(Color.RED);
            }
        });

        btn_changeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("おはようございます！！");
            }
        });

        btn_android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setBackground(getResources().getDrawable(R.drawable.ic_launcher_background));
            }
        });

        btn_changeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("おはようございます！！");
            }
        });

    }
}
