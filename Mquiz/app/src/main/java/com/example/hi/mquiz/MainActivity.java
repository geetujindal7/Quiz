package com.example.hi.mquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    RadioButton quiz1;
    RadioButton quiz2;
    RadioButton quiz3;
    RadioButton quiz4;
    CheckBox check1;
    CheckBox check2;
    EditText edit1;
    EditText edit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quiz1 = (RadioButton) findViewById(R.id.Quiz1a_text_view);
        quiz2 = (RadioButton) findViewById(R.id.Quiz2b_text_view);
        quiz3 = (RadioButton) findViewById(R.id.Quiz3c_text_view);
        quiz4 = (RadioButton) findViewById(R.id.Quiz5c_text_view);
        check1 = (CheckBox) findViewById(R.id.Quiz4a_text_view);
        check2 = (CheckBox) findViewById(R.id.Quiz4b_text_view);
        edit1 = (EditText) findViewById(R.id.edit1_text);
        edit2 = (EditText) findViewById(R.id.edit2_text);
    }
    public void submit(View view) {
        int g=0;
            if(check1.isChecked()&&check2.isChecked()) {
                        g = g + 2;
             }
            if (quiz1.isChecked()) {
                        g++;
            }
            if (quiz2.isChecked()) {
                        g++;
            }
            if (quiz3.isChecked()) {
                        g++;
            }
            if (quiz4.isChecked()) {
                        g++;
            }
        String editanswer = "Pranab mukherjee";
            if(edit1.getText().toString().equalsIgnoreCase(editanswer)) {
                        g = g + 2;
            }
        String editanswerlast = "movie";
            if(edit2.getText().toString().equalsIgnoreCase(editanswerlast)) {
                        g = g + 2;
            }
            if(g==10) {
                    Toast.makeText(this,"Your score"+"="+g+"\n"+"All are correct",Toast.LENGTH_SHORT).show();
            }
            else {
                    Toast.makeText(this,"Your Score"+"="+g+"\n"+"All are not correct",Toast.LENGTH_SHORT).show();
            }
    }
}
