package com.ik.sac.activity.login;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.dashboard.DashboardActivity;
import com.ik.sac.utils.Tools;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Tools.setSystemBarColorInt(this, Color.parseColor("#ab9400"));

        Button btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(v -> {
            Intent i = new Intent(LoginActivity.this, DashboardActivity.class);
            startActivity(i);
        });
    }
}