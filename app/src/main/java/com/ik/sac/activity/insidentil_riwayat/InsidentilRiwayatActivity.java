package com.ik.sac.activity.insidentil_riwayat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.insidentil.InsidentilActivity;
import com.ik.sac.activity.insidentil_riwayat_detail.InsidentilRiwayatDetailActivity;
import com.ik.sac.activity.insidentil_scan.InsidentilScanActivity;
import com.ik.sac.utils.Tools;

public class InsidentilRiwayatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insidentil_riwayat);
        Tools.setSystemBarColorInt(this, Color.parseColor("#430077"));

        LinearLayout btn_detail = findViewById(R.id.btn_detail);
        btn_detail.setOnClickListener(v -> {
            Intent i = new Intent(InsidentilRiwayatActivity.this, InsidentilRiwayatDetailActivity.class);
            startActivity(i);
        });

        LinearLayout btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(v -> {
            finish();
        });

    }

}