package app.techland.firstassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConstraintLayout extends AppCompatActivity {
Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);


    }

    public void Button1(View view) {
        startActivity(new Intent(getApplicationContext(),RelativeLayout.class));
    }
}