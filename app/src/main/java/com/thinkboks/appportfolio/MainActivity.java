package com.thinkboks.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void displayAToast(View view) {
        Button pressedButton = (Button) view;
        String projectName = pressedButton.getText().toString();
        String toastText = "This button will open the " + projectName + " project.";
        if (view.getId() == R.id.custom_app_button) {
            toastText = "This button will open my CAPSTONE project.";
        }
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }
}
