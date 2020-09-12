package com.iyaselerehoboth.gadsleaderboard;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.iyaselerehoboth.gadsleaderboard.databinding.ActivityMainBinding;
import com.iyaselerehoboth.gadsleaderboard.views.activities.Homepage;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        nextPage();
    }

    public void nextPage() {
        new Handler().postDelayed(() -> {
            startActivity(new Intent(MainActivity.this, Homepage.class));
            finish();
        }, 500);
    }
}