package com.ik.sac.activity.pekerjaan_deskripsi;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.utils.Tools;

public class PekerjaanDeskripsiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pekerjaan);
        Tools.setSystemBarColorInt(this, Color.parseColor("#349E02"));

        LinearLayout btn = findViewById(R.id.btn_dashboard);
        btn.setOnClickListener(v -> {
            Intent i = new Intent(PekerjaanDeskripsiActivity.this, PekerjaanDeskripsiActivity.class);
            startActivity(i);
        });

        LinearLayout btn_dashboard = findViewById(R.id.btn_dashboard);
        btn_dashboard.setOnClickListener(v -> {
            finish();
        });

    }

}