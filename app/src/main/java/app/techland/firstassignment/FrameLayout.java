package app.techland.firstassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FrameLayout extends AppCompatActivity {
TextView mClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
        mClick = findViewById(R.id.mClick);
    }

    public void ClickBtn(View view) {
        startActivity(new Intent(getApplicationContext(),ScrollView.class));
    }
}