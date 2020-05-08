package com.example.intern_task_0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static int count = 0;
    public String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = findViewById(R.id.Regdn);
        final Button button = findViewById(R.id.bn1);
        final TextView textView = findViewById(R.id.textView);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s = editText.getText().toString();
                if(s.length()==10)
                {
                    count++;
                    if(count%2!=0)
                    {
                        button.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                        textView.setText(R.string.name);
                    }
                    else {
                        button.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                        textView.setText("");
                    }

                }

            }

        });
        }

}
