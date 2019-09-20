package com.example.layouttehtava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button button_1;
    private Button button_2;
    private Button button_3;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        this.button_1 = findViewById(R.id.id_button_1);
        this.button_2 = findViewById(R.id.id_button_2);
        this.button_3 = findViewById(R.id.id_button_3);
        imageView =(ImageView)findViewById(R.id.imageView1);

        this.button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_2.isEnabled()&&button_3.isEnabled()) {
                    button_2.setEnabled(false);
                    button_3.setEnabled(false);
            }
                else {
                    button_2.setEnabled(true);
                    button_3.setEnabled(true);
                }
        }
    });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility((View.INVISIBLE));
            }
        });

        button_3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                return false;
            }
        });



    }
}
