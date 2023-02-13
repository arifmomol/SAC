package com.ik.sac.activity.pengawasan_riwayat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.pengawasan.PengawasanActivity;
import com.ik.sac.activity.pengawasan_riwayat_detail.PengawasanRiwayatDetailActivity;
import com.ik.sac.activity.pengawasan_scan.PengawasanScanActivity;
import com.ik.sac.utils.Tools;

public class PengawasanRiwayatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengawasan_riwayat);
        Tools.setSystemBarColorInt(this, Color.parseColor("#93013F"));

        LinearLayout btn_detail = findViewById(R.id.btn_detail);
        btn_detail.setOnClickListener(v -> {
            Intent i = new Intent(PengawasanRiwayatActivity.this, PengawasanRiwayatDetailActivity.class);
            startActivity(i);
        });

        LinearLayout btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(v -> {
            finish();
        });

    }

}