package com.ik.sac.activity.insidentil;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.insidentil_riwayat.InsidentilRiwayatActivity;
import com.ik.sac.activity.insidentil_scan.InsidentilScanActivity;
import com.ik.sac.activity.pekerjaan_riwayat.PekerjaanRiwayatActivity;
import com.ik.sac.activity.pekerjaan_scan.PekerjaanScanActivity;
import com.ik.sac.utils.Tools;

public class InsidentilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insidentil);
        Tools.setSystemBarColorInt(this, Color.parseColor("#430077"));

        LinearLayout btn_insidentil = findViewById(R.id.btn_insidentil);
        btn_insidentil.setOnClickListener(v -> {
            Intent i = new Intent(InsidentilActivity.this, InsidentilScanActivity.class);
            startActivity(i);
        });

        LinearLayout btn_insidentil_riwayat = findViewById(R.id.btn_insidentil_riwayat);
        btn_insidentil_riwayat.setOnClickListener(v -> {
            Intent i = new Intent(InsidentilActivity.this, InsidentilRiwayatActivity.class);
            startActivity(i);
        });

        LinearLayout btn_dashboard = findViewById(R.id.btn_dashboard);
        btn_dashboard.setOnClickListener(v -> {
            finish();
        });

    }

}