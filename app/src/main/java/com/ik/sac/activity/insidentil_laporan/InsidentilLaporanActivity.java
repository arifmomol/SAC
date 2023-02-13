package com.ik.sac.activity.insidentil_laporan;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.dashboard.DashboardActivity;
import com.ik.sac.activity.insidentil_deskripsi.InsidentilDeskripsiActivity;
import com.ik.sac.utils.Tools;

public class InsidentilLaporanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insidentil_laporan);
        Tools.setSystemBarColorInt(this, Color.parseColor("#430077"));

        LinearLayout btn_save = findViewById(R.id.btn_save);
        btn_save.setOnClickListener(v -> {
            Intent i = new Intent(InsidentilLaporanActivity.this, DashboardActivity.class);
            startActivity(i);
            finish();
        });

    }

}