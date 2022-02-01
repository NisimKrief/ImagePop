package com.example.imagepop;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rand = new Random();
    int random;
    ImageView iv;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.button);
        iv = findViewById(R.id.imageView);

    }
    public void go(View view){
        random = rand.nextInt(3) + 1;
        btn.setText("Image " + random);
        iv.setVisibility(View.VISIBLE);
        if (random == 1) {
            iv.setImageResource(R.drawable.leopard);
        }
        else if(random ==2){
            iv.setImageResource(R.drawable.kaleb);
            }
        else{
            iv.setImageResource(R.drawable.sos);
        }

        }

    }

