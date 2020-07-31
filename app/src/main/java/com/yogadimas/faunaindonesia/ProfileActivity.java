package com.yogadimas.faunaindonesia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ImageButton back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(profile);
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Intent profile = new Intent(ProfileActivity.this, MainActivity.class);
        startActivity(profile);
        finish();

    }

    public void onButtonTap(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"yoga.d.pambudi.1@gmail.com"});


        try {
            startActivity(Intent.createChooser(intent, "thank you for the email that will be sent to me!"));
        } catch (android.content.ActivityNotFoundException ex) {
            //do something else
        }
    }
}


