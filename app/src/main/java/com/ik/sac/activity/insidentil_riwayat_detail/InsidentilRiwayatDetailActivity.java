package com.ik.sac.activity.insidentil_riwayat_detail;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.insidentil_riwayat.InsidentilRiwayatActivity;
import com.ik.sac.activity.insidentil_riwayat_laporan.InsidentilRiwayatLaporanActivity;
import com.ik.sac.utils.Tools;

public class InsidentilRiwayatDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insidentil_riwayat_detail);
        Tools.setSystemBarColorInt(this, Color.parseColor("#430077"));

        LinearLayout btn_detail = findViewById(R.id.btn_detail);
        btn_detail.setOnClickListener(v -> {
            Intent i = new Intent(InsidentilRiwayatDetailActivity.this, InsidentilRiwayatLaporanActivity.class);
            startActivity(i);
        });

        LinearLayout btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(v -> {
            finish();
        });

    }

}