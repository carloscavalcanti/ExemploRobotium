package com.example.exemplorobotium;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button botao = (Button) findViewById(R.second.button1);
        botao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				TextView textView = (TextView) findViewById(R.second.textView1);
				EditText editText = (EditText) findViewById(R.second.editText1);
				textView.setText(editText.getText().toString());
			}
		});
        
    }
	
}
