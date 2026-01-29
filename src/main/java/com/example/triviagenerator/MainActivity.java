package com.example.triviagenerator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int count = 0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        }

        public void onClick(View v)
        {
            count++;
            String trivia1 = "A cloud weighs around a million tonnes.";
            String trivia2 = "Giraffes are 30 times more likely to get hit by lightning than people.";
            String trivia3 = "Identical twins don’t have the same fingerprints.";
            String trivia4 = "Earth’s rotation is changing speed.";
            String trivia5 = "Earlobes have no biological purpose.";
            String trivia6 = "Your brain is constantly eating itself.";
            String trivia7 = "The largest piece of fossilised dinosaur poo discovered is over 30cm long and over two litres in volume.";
            String trivia8 = "Mars isn’t actually round.";
            String trivia9 = "There’s no such thing as zero-calorie foods.";
            String trivia10 = "The Universe's average colour is called 'Cosmic latte'.";

            TextView textView1 = (TextView) findViewById(R.id.Trivia);
            Button button1 = (Button) findViewById(R.id.btn1);

            if(count == 1){
                textView1.setText(trivia1);
                button1.setText("NEXT");
            }
            else if(count == 2){
                textView1.setText(trivia2);
            }
            else if(count == 3){
                textView1.setText(trivia3);
            }
            else if(count == 4){
                textView1.setText(trivia4);
            }
            else if(count == 5){
                textView1.setText(trivia5);
            }
            else if(count == 6){
                textView1.setText(trivia6);
            }
            else if(count == 7){
                textView1.setText(trivia7);
            }
            else if(count == 8){
                textView1.setText(trivia8);
            }
            else if(count == 9){
                textView1.setText(trivia9);
            }
            else if(count == 10){
                textView1.setText(trivia10);
            }
            else if(count == 11) button1.setEnabled(false);
    }
}